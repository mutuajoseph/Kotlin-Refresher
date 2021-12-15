//TASK 2:
//Prompt the user for a number either on a form input or the terminal. Depending on whether the number is even or odd, display  either “odd” or “even” to the user.
//Hint: how does an even / odd number react differently when divided by 2?

fun main() {

    //Ask the user for an input
    println("Enter a number of choice")
    var value = readLine().toString().toInt()


    // check if the number is even or odd

    if (value % 2 == 0 ) {
        println("even")
    } else if (value % 2 != 0 ) {
        println("odd")
    } else {
        println("Invalid Number please try again")
    }
}