fun main(){
    var solution1 = "Toph"      // variable solutions1 - variable solution5 hold the correct answers to the quiz
    var solution2 = "Iroh"
    var solution3 = "Fire Lord Ozai"
    var solution4 = "Avatar Roku"
    var solution5 = "Princess Yue"

    var counter = 0  // this variable is a counter to hold the number of correct quiz answers the user got

    println("This is an Avatar the Last Airbender Quiz") // prints the title of the quiz
    println("Question 1: Who is Aang's earth bending teacher?") // prints the question
    var userAns1 = readLine()!!.toString()  // gets the users answer for the question
    var resultSol1 = solution1.compareTo(userAns1, true) // compares the correct answer with the users answers to see if it's correct

    if (resultSol1 == 0)   // checks if the user's answer is correct and prints the correct result
        println("That is correct!")

    else   // if it's the wrong answer it prints the response for getting it wrong.
        println("That is Not correct.")

    if (resultSol1 == 0) // checks if the user's answer is correct and add +1 if it's correct
        counter += 1

    println("Question 2: Who is Zuko's uncle?") // prints the question
    var userAns2 = readLine()!!.toString() // gets the users answer for the question
    var resultSol2 = solution2.compareTo(userAns2, true) // compares the correct answer with the users answers to see if it's correct

    if (resultSol2 == 0) // checks if the user's answer is correct and prints the correct result
        println("That is correct!")
    else   // if it's the wrong answer it prints the response for getting it wrong.
        println("That is Not correct.")

    if (resultSol2 == 0)  // checks if the user's answer is correct and add +1 if it's correct
        counter += 1

    println("Question 3: Who is the villain Aang must stop?") // prints the question
    var userAns3 = readLine()!!.toString() // gets the users answer for the question
    var resultSol3 = solution3.compareTo(userAns3, true) // compares the correct answer with the users answers to see if it's correct

    if (resultSol3 == 0) // checks if the user's answer is correct and prints the correct result
        println("That is correct!")
    else   // if it's the wrong answer it prints the response for getting it wrong.
        println("That is Not correct.")

    if (resultSol3 == 0)  // checks if the user's answer is correct and add +1 if it's correct
        counter += 1

    println("Question 4: Who was the Avatar before Aang?") // prints the question
    var userAns4 = readLine()!!.toString() // gets the users answer for the question
    var resultSol4 = solution4.compareTo(userAns4, true) // compares the correct answer with the users answers to see if it's correct

    if (resultSol4 == 0) // checks if the user's answer is correct and prints the correct result
        println("That is correct!")
    else   // if it's the wrong answer it prints the response for getting it wrong.
        println("That is Not correct.")

    if (resultSol4 == 0)  // checks if the user's answer is correct and add +1 if it's correct
        counter += 1

    println("Question 5: At the end of Book 1 who became the Moon Spirit?") // prints the question
    var userAns5 = readLine()!!.toString() // gets the users answer for the question
    var resultSol5 = solution5.compareTo(userAns5, true) // compares the correct answer with the users answers to see if it's correct

    if (resultSol5 == 0) // checks if the user's answer is correct and prints the correct result
        println("That is correct!")
    else   // if it's the wrong answer it prints the response for getting it wrong.
        println("That is Not correct.")

    if (resultSol5 == 0)  // checks if the user's answer is correct and add +1 if it's correct
        counter += 1

    println("You got $counter out of 5 questions correct.") // prints the result of how many questions you got right out of 5
}