package stack

fun main() {
    val stack = StackImpl<Int>().apply {
        push(1)
        push(2)
        push(3)
        push(4)
        push(5)
    }

    println(stack)

    val poppedElement = stack.pop()
    println("Popped: $poppedElement")
    print(stack)

    val peekedElement = stack.peek()
    if (peekedElement != null) {
        println("Peeked: $peekedElement")
    }
    print(stack)
}