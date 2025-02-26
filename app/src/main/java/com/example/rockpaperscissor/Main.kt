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
