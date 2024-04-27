package contolFlowStructure

fun main() {
    var trafficLightColor = "Red"

    // Simple if
    if (trafficLightColor == "Red") {
        println("Stop")
    }

    // if/else
    trafficLightColor = "Green"
    if (trafficLightColor == "Red") {
        println("Stop")
    } else {
        println("Go")
    }

    // When Statement
    trafficLightColor = "Black"
    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yello" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic light color")
    }
}
