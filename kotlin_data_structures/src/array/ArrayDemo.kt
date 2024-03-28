package array

class ArrayDemo {
    fun run() {
        val arr = Array(5) { 0 }
        arr[0] = 1
        arr[1] = 2
        arr[2] = 3
        arr[3] = 4
        arr[4] = 5

        for (i in 0..4) {
            println(arr[i])
        }
    }

}

fun main() {
    val demo = ArrayDemo()
    demo.run()
}