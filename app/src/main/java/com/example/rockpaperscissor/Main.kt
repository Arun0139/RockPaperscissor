//package com.example.rockpaperscissor
//
///*
//
//Rules : User chooses either of 3 choices - Rock, Paper or Scissors
//        Computer also chooses
//
//        if user wins -> +1 point
//        if computer wins -> -1 point
//        if draw -> 0 point
//
//        winner is the one who has highest points
//
//        Logic for deciding the winner :
//        if user has rock and computer has scissors -> user wins
//        if user has rock and computer has rock -> user wins
//        if user has scissors and computer has paper -> user wins
//        if user has rock and computer has paper -> Computer wins
//        if user has paper and computer has scissors -> Computer wins
//        if user has scissors and computer has rock -> Computer wins
//
//        if user has rock and computer has rock -> Draw
//        if user has paper and computer has paper -> Draw
//        if user has scissors and computer has scissors -> Draw
//
// */
//
//fun main(){
//    while(true){  //infinite loop
//        println("Enter you choice :")
//        println("1. Rock")
//        println("2. Paper")
//        println("3. Scissors")
//        println("4. Exit")
//
//        val userChoice = readln().toInt()  //user choice is to take the input from the user and store his choice
//
//        if(userChoice ==4){  // if user choose 4, exit the game
//            println("Exiting the game..")
//            break
//        }
//        if(userChoice !in 1..3){  // if user choose other than 1,2,3, then print invalid choice
//            println("Invalid choice. Please enter a number between 1 and 3")
//            continue
//        }
//        val computerChoice = (1..3).random() // computer choice is to generate random number between 1 and 3
//        println("you chose : ${userChoice}")
//        println("Computer chose : ${computerChoice}")
//
//        val result = getWinner(userChoice , computerChoice)   // get the winner of the game
//    }
//}
//fun getWinner(userChoice : Int , computerChoice : Int) : String {  // function to get the winner of the game
//    if(userChoice == computerChoice){
//        return "Draw"
//    }
//    if(userChoice == 1 && computerChoice == 3 || userChoice == 2 && computerChoice == 1 || userChoice == 3 && computerChoice == 2){  // if user wins
//        return "User win"
//    }
//    else{
//        return "Computer wins"
//    }
//}

package com.example.rockpaperscissor

fun main() {
    var userPoints = 0
    var computerPoints = 0

    while(true) {
        println("Enter your choice:")
        println("1. Rock")
        println("2. Paper")
        println("3. Scissor")
        println("4. Exit")

        val userChoice = readln().toInt()
        if (userChoice == 4) {
            println("Exiting the game...")
            println("Final Score - User: $userPoints, Computer: $computerPoints")
            break
        }
        if (userChoice !in 1..3) {
            println("Invalid choice. Please enter a valid choice between 1 to 4.")
            continue
        }

        val computerChoice = (1..3).random()
        println("Computer choice is $computerChoice")

        val result = getWinner(userChoice, computerChoice)
        println(result)

        if (result == "User wins") {
            userPoints++
        } else if (result == "Computer wins") {
            computerPoints++
        }

        println("Score - User: $userPoints, Computer: $computerPoints")
    }
}

fun getWinner(userChoice: Int, computerChoice: Int): String {
    return if (userChoice == computerChoice) {
        "Draw"
    } else if ((userChoice == 1 && computerChoice == 3)
        || (userChoice == 2 && computerChoice == 1)
        || (userChoice == 3 && computerChoice == 2)
    ) {
        "User wins"
    } else {
        "Computer wins"
    }
}