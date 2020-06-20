# IMC
 
 
## Calculadora IMC intuitiva em Kotlin

  Este é meu primeiro projeto nesta linguagem, o aplicativo é bem simples apresenta uma interface de facil uso para qualquer um.
  
## Objetivo

  Ela realiza o famoso cálculo do IMC (Indice de Massa Corporal) fazendo a relação do peso com a altura a formula é = ** PESO / (ALTURA)² **
  esta formula retorna um indice que de acordo com a tabela IMC, informa ao usuario qual a sua sitação:
  
###  IMC	CLASSIFICAÇÃO	OBESIDADE (GRAU)
  
  MENOR QUE 18,5	MAGREZA	0
  
  ENTRE 18,5 E 24,9	NORMAL	0
  
  ENTRE 25,0 E 29,9	SOBREPESO	I
  
  ENTRE 30,0 E 39,9	OBESIDADE	II
  
  MAIOR QUE 40,0	OBESIDADE GRAVE	III
 
## Funcionamento

  O app solicita duas entradas do usuário, para altura e peso, dentro do arquivo MainActivity.kt é realizado todos os calculos do app.
  
 Setei um Button Click Listener (Que sempre ouve caso o botão enviar seja pressionado), quando pressionado:
 
 1 - Ele criar duas variaveis Float recebendo zero e uma boolean chamada erro recebendo false, logo após isso ele tenta converter as entradas do usuário e atribui-las para estas variaveis,
 caso não consiga ele atribui true a variavel erro e logo solicita que o usuario preencha os campos.
 
 2 - O próximo passo é realizar o calculo da IMC com a formula citada acima e o atribui a variavel result
 
 3 - O valor da variavel result cai na função showStatus, que basicamente faz o papel da tabela de classificação
 
 4 - Este mesmo valor da result cai em setImage, que assimila o o IMC a uma Imagem de aviso (Apenas um recurso visual)
 
 5 - Encontrar o Drawable que vai mostrar o resultado da função acima e logo após altera-lo
 
 6 - Por ultimo, para facilitar o uso ele retira o que foi digitado nos campos para preparar o App para uma nova consulta do usuario 
