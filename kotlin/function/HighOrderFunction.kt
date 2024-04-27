package function

fun add(value1: Int, value2: Int, calculator: (Int, Int) -> Int) {
    println("The sum is: ${calculator(value1, value2)}")
}

fun main() {
    add(5, 7) { value1, value2 ->
        value1 + value2
    }

    add(5, 7) { value1, value2 ->
        value1 - value2
    }
}
