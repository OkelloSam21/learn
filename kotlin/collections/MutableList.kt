package collections

fun main() {
    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    // add pluto
    solarSystem.add("Pluto")

    // add Theia at index 3 between Earth and Mars
    solarSystem.add(3, "Theia")

    // Update element at index 3
    solarSystem[3] = "Future moon"

    // remove element at index 9
    solarSystem.removeAt(9)

    // remove "Future Moon"
    solarSystem.remove("Future Moon")

    // check if element exists
    println("Future Moon" in solarSystem)

    println("Future Moon" in solarSystem)
}
