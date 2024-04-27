package contolFlowStructure

fun checkType(input: Any?) {

    if (input == null) return
    if (input is String?) {
        println("Input is a String with length ${input.length}")
    }

    if (input !is Int) {
        println("Input is not an Int")
    }
}
fun main() {
    val aGenericVariable: Any = 5
//    val anInt: Int = aGenericVariable as Int

    val myVariable: String = "Kotlin"

    println(checkType(aGenericVariable))
//    println(checkType(anInt))
//    println(checkType(myVariable))
}
