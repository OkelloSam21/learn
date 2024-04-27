package collections

fun main() {
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")

    // Add two arrays
    val solarSystem = rockPlanets + gasPlanets

    // Access elements in the solarSystem
    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])

    // modify values
    solarSystem[3] = "Little Earth"
    println(solarSystem[3])
}
