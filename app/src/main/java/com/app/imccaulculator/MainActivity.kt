package com.app.imccaulculator

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener{
            var height:Float = 0f
            var weight:Float = 0f
            var error:Boolean = false
            try {
                height = (inputHeight.text.toString().toFloat())/100
                weight = inputWeight.text.toString().toFloat()
            }catch (e:Exception){
                error = true
                resultOutput.text = "Preencha os Campos acima"
            }
            val result = calculate(height, weight)
            val status:String = showStatus(result)
            val currentImage = setImage(result)
            val image = statusImage
            image.setImageDrawable(currentImage)
            if(!error) resultOutput.text = "Seu IMC é $result\n $status"
            inputHeight.setText("")
            inputWeight.setText("")
        }
    }

    fun calculate(heigth:Float, weight:Float):Float{
        val heigth_2 = heigth * heigth
        var imc = weight / heigth_2
        imc = (Math.round(imc * 100) / 100).toFloat()
        return imc
    }

    fun showStatus(imc:Float):String{
        var status:String
        if (imc in 0.0..18.5){
            status = "Abaixo do Peso"
        }else if (imc in 18.5..24.9){
            status = "Peso Normal"
        }else if ( imc in 25.0..29.9){
            status = "Sobrepeso"
        }else if (imc in 30.0..34.9){
            status = "Obesidade Grau 1"
        }else if (imc in 35.0..39.9){
            status = "Obesidade Grau 2"
        }else {
            status = "Obesidade Grau 3"
        }
        return status
    }

    fun setImage(imc: Float):Drawable{
        val redImage:Drawable = resources.getDrawable(R.drawable.red)
        val greenImage:Drawable = resources.getDrawable(R.drawable.green)
        val yellowImage:Drawable = resources.getDrawable(R.drawable.yellow)

        if (imc in 18.5..24.9){
            return greenImage
        }else if (imc in 25.0..29.9){
            return yellowImage
        }else{
            return redImage
        }
    }

}