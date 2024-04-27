package contolFlowStructure

fun main() {
    try {
        val message = "The value is ${10 / 0}"
    } catch (error: Throwable) {
        println("Error was thrown")
    }

    val message = try {
        "The value is ${10 / 0}"
    } catch (error: ArithmeticException) {
        "Error was thrown"
    } catch (error: java.lang.IllegalStateException) {
        "Error was IllegalState"
    }

    println(message)
}
