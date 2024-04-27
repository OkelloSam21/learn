package function

import java.lang.Math.pow

/*
* Greeting function
*/
fun getGreeting(name: String) = "Hello $name"

/*
 * Function to add two integers
 */
fun addInt(num1: Int, num2: Int): Int {
    return num1 + num2
}

/**
 * Function that takes student details
 * and returns the details as a string.
 */
fun studentDetails(name: String, regNo: String, yearOfStudy: Int): String {
    return "name: $name \nregistration number: $regNo \nYear Of Study: $yearOfStudy \n"
}

/**
 * Function that takes a 4bit binary number and returns
 * Its equivalent decimal number
 */
fun binaryToDecimal(): Double {
    val leftMost = readln().toInt()
    val left = readln().toInt()
    val right = readln().toInt()
    val rightMost = readln().toInt()
    val result = leftMost * pow(2.0, 3.0)
    return result
}

fun main() {
    println(getGreeting("Kotlin"))
}
