//TASK 3:
//Write a program which gets a phone number from a form input or terminal. Validates the phone number by checking if it starts with +254.. or 07.. or 71… or 254.. or 01... Convert the number to start with +254…
//e.g if a user enters “0712345678”, the program should display “+254712345678”

fun main() {

    println("Enter a phone numebr of choice:")

    var phoneNumber = readLine().toString()

    // check if phone number starts with the flowing substrings
    // case 1: +254
    if (phoneNumber.startsWith("+254")) {
        // return the phone number as it is
        println(phoneNumber)
    } else if (phoneNumber.startsWith("07")) {
        // replace the substring with +254
        var newPhoneNumber = phoneNumber.replace(
            "07",
            "+2547"
        )
        println(newPhoneNumber)
    } else if (phoneNumber.startsWith("71")) {
        // replace the substring with +254
        var newPhoneNumber = phoneNumber.replace(
            "71",
            "+2547"
        )
        println(newPhoneNumber)
    } else if (phoneNumber.startsWith("254")) {
        // replace the substring with +254
        var newPhoneNumber = phoneNumber.replace(
            "254",
            "+2547"
        )
        println(newPhoneNumber)
    } else if (phoneNumber.startsWith("01")) {
        // replace the substring with +254
        var newPhoneNumber = phoneNumber.replace(
            "01",
            "+2547"
        )
        println(newPhoneNumber)
    } else {
        println("Validation not satisfied. Please try again with a valid number.")
    }
}