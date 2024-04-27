package collections

fun main() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    // Get number of elements using 'size' property of liat
    println(solarSystem.size)

    // Print the planet at index 2 using subscript syntax.
    println(solarSystem[2])

    // Print the element at index 3 by calling get() on the solarSystem list.
    println(solarSystem.get(3))

    // Print the result of calling indexOf() on the solarSystem list,
    // passing in "Earth"
    println(solarSystem.indexOf("Earth"))

    // Call indexOf(), passing in "Pluto", and print the result.
    println(solarSystem.indexOf("Pluto"))

    // print out each planet name on a separate line using a for loop
    for (planet in solarSystem) {
        println(planet)
    }
}
