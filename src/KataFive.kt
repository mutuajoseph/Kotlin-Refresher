//TASK 5:
//Implement a program that takes 3 form inputs or from the terminal, and stores them in three variables. Return the largest of the three. Do this without using the the inbuilt max () function!
//The goal of this exercise is to think about some internals that programs normally take care of for us.
//Extras:
//If the number is a multiple of 4, display out a different message.


fun main() {

    println("Enter Value One")
    var valueOne = readLine().toString().toInt()

    println("Enter Value Two")
    var valueTwo = readLine().toString().toInt()

    println("Enter Value Three")
    var valueThree = readLine().toString().toInt()

    var largest = 0

    if (valueOne > valueTwo && valueOne > valueThree) {
        largest = valueOne
    } else if (valueTwo > valueOne && valueTwo  > valueThree) {
        largest = valueTwo
    } else if (valueThree > valueOne && valueThree > valueTwo) {
        largest = valueThree
    } else {
        println("Invalid Number input. Please try again")
    }

    if (largest % 4 == 0) {
        println("Number is divisible by four")
    }

    println("The largets Value is: $largest")
}