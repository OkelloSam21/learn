package generics

import enums.Difficulty

class Quiz<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty,
)

class Question()

fun main() {
    val question1 = Quiz<String>("Quoth the raven ___", "never more", Difficulty.MEDUIM)
    val question2 = Quiz<Boolean>("The sky is blue, true or false", true, Difficulty.EASY)
    val question3 = Quiz<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
}
