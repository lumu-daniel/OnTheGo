
# On The Go

Is a simple exercise tracking application that aims at keeping the histories of you cumulative cardio.

It uses a lifecycle service which starts a notification channel that show the user relevant information during their workouts.
The project employs reactive programming using the MVVM architecture and concurrent programming with a lifecycle service.
It also takes advantage of the google mapview to track and map polylines in realtime.

### Set Up
[<img src='https://github.com/lumu-daniel/OnTheGo/blob/master/app/src/main/res/drawable/set_up.png' alt='Search for Pokemon' height='280'>]
 Calories burned depend on a specific user weight and the distance they have covered.
 So we definitely take in the user's weight and their names for personalization.

### Work-Out List
[<img src='https://github.com/lumu-daniel/OnTheGo/blob/master/app/src/main/res/drawable/run_list.png' alt='Purchase Result Failed' height='280'>]
 All runs are saved in the local sqlite database using Room. 
 This list retrieves the user's runs along with their maps snapshot

### Initiate Run
[<img src='https://github.com/lumu-daniel/OnTheGo/blob/master/app/src/main/res/drawable/run_init.png' alt='Purchase Result Failed' height='280'>]
 A floating action button is used to start a new run while tracking it on the googleMap. 
 A run is started with the start button.

### Finish Run
[<img src='https://github.com/lumu-daniel/OnTheGo/blob/master/app/src/main/res/drawable/finish_run.png' alt='Purchase Result Failed' height='280'>]
 To finish a run click on the finish button

### Statistics
[<img src='https://github.com/lumu-daniel/OnTheGo/blob/master/app/src/main/res/drawable/run_stats.png' alt='Purchase Result Failed' height='280'>]
 Shows the totals of the user's exercise essentials.
 And also shows a graph of the respective exercises.

### Service Notification
[<img src='https://github.com/lumu-daniel/OnTheGo/blob/master/app/src/main/res/drawable/notification.png' alt='Purchase Result Failed' height='280'>]
 Displays the essentials of the ongoing run


## Technologies and Tools
#### UX Design: &nbsp; [<img src='https://github.com/lumu-daniel/lumu-daniel/blob/main/assets/images/jc_icon.png' alt='JetPack Compose' height='18'>](https://www.figma.com/developers) [JetPack Compose](https://developer.android.com/jetpack) &nbsp; | &nbsp; [<img src='https://github.com/lumu-daniel/lumu-daniel/blob/main/assets/images/adobe-xd.gif' alt='Adobe XD' height='18'>](https://www.adobe.com/products/xd.html) [Adobe XD]

#### Languages/Scripts: &nbsp; [<img src='https://github.com/lumu-daniel/lumu-daniel/blob/main/assets/images/java.png' alt='Java' height='18'>](https://www.java.com/en/) [Java] &nbsp; | &nbsp; [<img src='https://github.com/lumu-daniel/lumu-daniel/blob/main/assets/images/kotlin.png' alt='TypeScript' height='18'>](https://kotlinlang.org/) [Kotlin] &nbsp; | &nbsp; [<img src='https://github.com/lumu-daniel/lumu-daniel/blob/main/assets/images/dart.png' alt='HTML5' height='18'>](https://dart.dev/) [Dart] &nbsp; | &nbsp; [<img src='https://github.com/lumu-daniel/lumu-daniel/blob/main/assets/images/javascript.gif' alt='Java Script' height='18'>](https://www.javascript.com/) [Java Script]

#### Frontend: &nbsp; [<img src='https://github.com/lumu-daniel/lumu-daniel/blob/main/assets/images/jc_icon.png' alt='JetPack Compose' height='18'>](https://reactjs.org/docs/getting-started.html) JetPack Compose &nbsp; | &nbsp; [<img src='https://github.com/lumu-daniel/lumu-daniel/blob/main/assets/images/material-ui.png' alt='Material Design' height='18'>](https://material.io/design) [Material Design] &nbsp; | &nbsp; [<img src='https://github.com/lumu-daniel/lumu-daniel/blob/main/assets/images/bootstrap.png' alt='Android Views' height='18'>](https://developer.android.com/reference/android/view/View) [Android Views]
