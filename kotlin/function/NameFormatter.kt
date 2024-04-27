package function

// write a function that satisfies the following

// function takes 2 strings for first and last name
// function takes a formatting function parameter
// function should print the result of the passed format function

fun nameFormatter(firstName: String, lastName: String, format: (String, String) -> String) {
    println(format(firstName, lastName))
}

val basicFormatter: (String, String) -> String = { fName, lName ->
    "$fName $lName"
}

val fancyFormatter: (String, String) -> String = { fName, lName ->
    "First Name is $fName and Last Name is $lName"
}

fun main() {
    nameFormatter("Samuel", "Okello", basicFormatter)
    nameFormatter("Samuel", "Okello", fancyFormatter)
}
