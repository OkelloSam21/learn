package collections

fun main() {
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14,
    )

    // print size
    println(solarSystem.size)

    //  use subscript syntax to set additional key-value pairs
    solarSystem["Pluto"] = 5

    // print size
    println(solarSystem.size)

    // use subscript syntax to get a value
    println(solarSystem["Pluto"])

    // access values using get()
    println(solarSystem.get("Theia"))

    // Print the result from calling remove() and passing in "Pluto"
    solarSystem.remove("Pluto")

    // verify that the item was removed, print the size again
    println(solarSystem.size)
}
