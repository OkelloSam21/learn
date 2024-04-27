package singletonobject

object StudentProgress {
    var total: Int = 10
    var answered: Int = 4
}

// Accessing singleton object
fun main() {
    println("${StudentProgress.answered} of ${StudentProgress.total} answered")
}
