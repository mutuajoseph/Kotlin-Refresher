//TASK 4:
//Write a program which accepts email as form input or from terminal. Validate the email by checking if it contains an “@” symbol and “.” symbol.
//Hint: In Python you can use the string split method e.g my_email.split(“@”) or my_email(“@” )


fun main() {

    println("Enter an email address of choice")

    var emailAddress = readLine().toString()

    if(emailAddress.contains("@") && emailAddress.contains(".")) {
        println("Valid Email Address")
    } else {
        println("Invaid Email Address")
    }
}