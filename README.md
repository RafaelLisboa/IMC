![Image](https://github.com/RafaelLisboa/IMC/blob/master/images/AppImage.jpg)

# BMI
 
 
## Intuitive BMI calculator in Kotlin

  This is my first project in this language, the application is very simple and has an easy-to-use interface for anyone.
  
## Objective

  She performs the famous calculation of BMI (Body Mass Index) making the relationship of weight to height the formula is = ** WEIGHT / (HEIGHT) ² **
  this formula returns an index that, according to the BMI table, informs the user what their location is:
  
### BMI CLASSIFICATION OBESITY (DEGREE)
  
  LESS THAN 18.5 SLIMMING 0
  
  BETWEEN 18.5 AND 24.9 NORMAL 0
  
  BETWEEN 25.0 AND 29.9 OVERWEIGHT I
  
  BETWEEN 30.0 AND 39.9 OBESITY II
  
  GREATER THAN 40.0 SERIOUS OBESITY III
 
## Operation

  The app requests two user inputs, for height and weight, within the MainActivity.kt file, all calculations of the app are performed.
  
 Setei a Button Click Listener (which always hears if the send button is pressed), when pressed:
 
 1 - He creates two Float variables receiving zero and a boolean called error receiving false, after that he tries to convert the user's inputs and assign them to these variables,
 if not, he assigns the variable error to true and then asks the user to fill in the fields.
 
 2 - The next step is to perform the BMI calculation with the formula mentioned above and assign it to the result variable
 
 3 - The value of the result variable falls in the showStatus function, which basically plays the role of the classification table
 
 4 - This same result value falls in setImage, which assimilates the BMI to a warning image (Only a visual resource)
 
 5 - Find the Drawable that will show the result of the above function and right after changing it
 
 6 - Finally, to make it easier to use it removes what was typed in the fields to prepare the App for a new user consultation
