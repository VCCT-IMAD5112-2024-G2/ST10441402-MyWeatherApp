Alex Reisenberg-St10441402

Repository link: https://github.com/VCCT-IMAD5112-2024-G2/ST10441402-MyWeatherApp

The purpose of the Weather Application is to provide users with an intuitive and user-friendly interface to input, manage, and analyze weather data for different days. Users can record daily temperatures, weather conditions, and other relevant information, and the app offers functionality to calculate and display the average temperature over a period of time. This tool aims to help users track weather trends, make informed decisions based on historical weather data, and improve their understanding of weather patterns.

The pseudocode
SplashScreenActivity
Initialize Variables

splashScreenDuration
OnCreate Method

Set content view to activity_splash_screen
Set a delay for splashScreenDuration (e.g., 2 seconds)
After the delay, navigate to MainScreenActivity
MainScreenActivity
Initialize Variables

dayEditText
temperatureEditText
maxTemperatureEditText
minTemperatureEditText
weatherConditionEditText
averageTemperatureTextView
addButton
calculateAverageButton
clearButton
nextButton
OnCreate Method

Set content view to activity_main_screen
Initialize all the EditText, TextView, and Button variables with their respective IDs
Set addButton click listener to call addTemperature function
Set calculateAverageButton click listener to call calculateAverageTemperature function
Set clearButton click listener to call clearData function
Set nextButton click listener to call navigateToDetailedScreen function
addTemperature Function

Get text from dayEditText, temperatureEditText, maxTemperatureEditText, minTemperatureEditText, weatherConditionEditText
Convert temperature, maxTemperature, minTemperature to Integer (handle null values)
If all fields are filled correctly
Add the values to their respective lists (days, temperatures, maxTemperatures, minTemperatures, weatherConditions)
Clear the EditText fields
Show a Toast message "Data added successfully"
Else
Show a Toast message "Please fill all fields correctly"
calculateAverageTemperature Function

If temperatures list is not empty
Calculate the average of the temperatures list
Set the text of averageTemperatureTextView to display the average temperature
Else
Show a Toast message "No temperature data available"
clearData Function

Clear all the lists (days, temperatures, maxTemperatures, minTemperatures, weatherConditions)
Clear the EditText fields
Reset the averageTemperatureTextView text
Show a Toast message "Data cleared"
navigateToDetailedScreen Function

Create an Intent to navigate to DetailedScreenActivity
Add extra data (e.g., lists of days, temperatures, maxTemperatures, minTemperatures, weatherConditions) to the Intent
Start DetailedScreenActivity
DetailedScreenActivity
Initialize Variables

days
temperatures
maxTemperatures
minTemperatures
weatherConditions
detailsTextView
backButton
OnCreate Method

Set content view to activity_detailed_screen
Retrieve extra data from Intent (days, temperatures, maxTemperatures, minTemperatures, weatherConditions)
Initialize detailsTextView and backButton
Display detailed weather information in detailsTextView using the retrieved data
Set backButton click listener to call navigateBackToMainScreen function
navigateBackToMainScreen Function

Finish DetailedScreenActivity to return to MainScreenActivity
User Interface Layouts
activity_splash_screen.xml
Layout Components:
ImageView or TextView for the splash screen logo or message
activity_main_screen.xml
Layout Components:
EditText for day input (dayEditText)
EditText for temperature input (temperatureEditText)
EditText for max temperature input (maxTemperatureEditText)
EditText for min temperature input (minTemperatureEditText)
EditText for weather condition input (weatherConditionEditText)
TextView to display average temperature (averageTemperatureTextView)
Button to add data (addButton)
Button to calculate average temperature (calculateAverageButton)
Button to clear all data (clearButton)
Button to navigate to the detailed screen (nextButton)
activity_detailed_screen.xml
Layout Components:
TextView to display detailed weather information (detailsTextView)
Button to navigate back to the main screen (backButton)

![Detailed View screen](https://github.com/VCCT-IMAD5112-2024-G2/ST10441402-MyWeatherApp/assets/164515024/fabbb6e1-a634-4fd0-821a-9006d9dea571)
![spalsh screen](https://github.com/VCCT-IMAD5112-2024-G2/ST10441402-MyWeatherApp/assets/164515024/eeca9c30-c52d-4132-a1a9-82f9dba92285)
![Main screen](https://github.com/VCCT-IMAD5112-2024-G2/ST10441402-MyWeatherApp/assets/164515024/6f1483d2-9ae6-46ba-b092-a5e0224fead1)
