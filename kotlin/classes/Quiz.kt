package classes

import interfaces.ProgressPrintable

class Quiz : ProgressPrintable {

    companion object {
        const val ANSWERED: Int = 4
        const val TOTAL: Int = 10
    }
    override val progressText: String
        get() = "$ANSWERED of $TOTAL answered"

    override fun printProgressBar() {
        repeat(ANSWERED) { print("▓") }
        repeat(TOTAL - ANSWERED) { print("▒") }
        println()
        println(progressText)
    }
}

fun main() {
    Quiz().printProgressBar()
}
