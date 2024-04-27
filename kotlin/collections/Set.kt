package collections

fun main() {
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    // Print the size of the set using the size property
    println(solarSystem.size)

    // add an item
    solarSystem.add("Pluto")

    println(solarSystem.size)

    // check if "Pluto" is contained in the set
    println(solarSystem.contains("Pluto"))

    // add a duplicate
    solarSystem.add("Pluto")

    // size
    println(solarSystem.size)

    // remove an item
    solarSystem.remove("Pluto")

    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))
}
