package contolFlowStructure

fun main() {
    /**
     * print values from 0 to 5 (5 is exclusive
     */
    for (i in 0 until 5)

        /**
         * print values from 0 t0 5
         */
        for (i in 0..5) println(i)
    /**
     * print values of i from 10 to 0
     */
    for (i in 10 downTo 0) println(i)
    /**
     * print values from 10 to 0 but jumping 2 each time
     */
    for (i in 10 downTo 0 step 2) print(i)
}
