package CommonDataTypes // ktlint-disable package-name

fun main() {
    val aNullableString: String? = null

    // safe call operator
    println(aNullableString?.length)

    // elvis operator (?:)
    val elvisOperator: String? = null
    print(elvisOperator?.length ?: "The value is null")
}
