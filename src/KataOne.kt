//TASK 1:
//Write a program that has an array or a list a = [5, 10, 15, 20, 25].
//Make a new array/list of only the first and last elements of the given array/list above.

fun main() {

    var a = mutableListOf(5, 10, 15, 20, 25)

    var newList = mutableListOf(0)

    //access the first element
    var firstElement = a[0]
    newList.removeAt(0)
    newList.add(firstElement)

    //access the last element
    var lastElement = a[a.size - 1]
    newList.add(lastElement)
    println(newList)
}

