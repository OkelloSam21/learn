package stack

/**
 * Reverse a string using a stack
 */

fun reverseString(str: String): String {
    val stack = StackImpl<Char>()
    str.forEach {
        stack.push(it)
    }
    val result = StringBuilder()
    while (!stack.isEmpty()) {
        result.append(stack.pop())
    }
    return result.toString()
}

fun main() {

    val myStr = "Hello"
    val reversed = reverseString(myStr)
    println(reversed)
}

