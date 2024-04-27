package contolFlowStructure

fun getMessage(input: Int) = if (input > 3) {
    "Greater than 3"
} else {
    "Not greater than 3"
}

fun getMessageWithWhen(input: Int) = when (input) {
    3 -> "Value is 3"
    else -> "Value is not 3"
}

fun main() {
    var myVariable = 5

    val message1 = if (myVariable > 5) {
        "The value was greater then 5"
    } else {
        "Not greater than 5"
    }

    val message2 = when (myVariable) {
        3 -> "The value is three"
        else -> "The value is not 3"
    }
}
