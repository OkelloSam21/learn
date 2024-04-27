package CommonDataTypes // ktlint-disable package-name

fun main() {
    val aChar: Char = 'a'
    val anotherChar = '1'

    val name: String = "Kotlin"
    val concatString = "age" + "6"
    val concatNumber = "The number" + 22

    val raw =
        """
            Some
                multiline
            Text
                are written
            here
        """.trimIndent()
    println(raw)

    val aNumber = 10
    val concatTemplate = "The number ${aNumber + 1}"
    println(concatTemplate)

    val myString = "Hello Sam"
    val otherString = " "
    println(otherString.isNotBlank())
    print(myString.isEmpty())
}
