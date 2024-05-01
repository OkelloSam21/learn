package com.samuelokello.openjobs.domain.model

data class Position(
    val companyDescription: String,
    val description: String,
    val id: Int,
    val image: String,
    val salaryRange: String,
    val technologies: List<String>,
    val title: String
)
