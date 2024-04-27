package function

var greetingFunction: () -> Unit = {
    println("Hello Sam")
}

var getGreeting: (String) -> String = {
    "Hello $it"
}
fun main() {
    greetingFunction()

    greetingFunction = {
        println("Hello World!")
    }

    greetingFunction()

    println(getGreeting.invoke("Kotlin"))
}
