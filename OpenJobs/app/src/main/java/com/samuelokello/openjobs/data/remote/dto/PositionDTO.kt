package com.samuelokello.openjobs.data.remote.dto


import com.samuelokello.openjobs.domain.model.Position
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PositionDTO(
    @SerialName("company_description")
    val companyDescription: String,
    @SerialName("description")
    val description: String,
    @SerialName("id")
    val id: Int,
    @SerialName("image")
    val image: String,
    @SerialName("salary_range")
    val salaryRange: String,
    @SerialName("technologies")
    val technologies: List<String>,
    @SerialName("title")
    val title: String
){
    fun toPosition() = Position(
        companyDescription = companyDescription,
        description = description,
        id = id,
        image = image,
        salaryRange = salaryRange,
        technologies = technologies,
        title = title
    )
}