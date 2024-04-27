package contolFlowStructure

// Refactor getOutput() to use a when expression
// fun getOutput(input: Any?): String = if (input is Number) {
//    if (input !is Int) {
//        "Input was an Int"
//    } else {
//        "Input was a non-Int number"
//    }
// } else if (input is String) {
//    "input was a String with length ${input.length}"
// } else if (input == null) {
//    "input was a null"
// } else {
//    "Input didn't match target inputs"
// }

fun getOutput(input: Any?): String = when (input) {
    is Number -> {
        if (input !is Int) {
            "Input was an Int"
        } else {
            "Input was a non-Int number"
        }
    }

    is String -> "Input was a String with length ${input.length}"
    null -> "Input is null"
    else -> "Input didn't match target input"
}

fun main() {
    //
    println(getOutput(null))
    println(getOutput(5))
    println(getOutput(34.87))
    println(getOutput("Kotlin"))
}
