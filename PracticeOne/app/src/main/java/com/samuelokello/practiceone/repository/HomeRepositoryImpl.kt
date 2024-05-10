package com.samuelokello.practiceone.repository

import com.samuelokello.practiceone.R
import com.samuelokello.practiceone.data.Experience
import com.samuelokello.practiceone.data.Preference
import com.samuelokello.practiceone.domain.HomeRepository

class HomeRepositoryImpl : HomeRepository {
    override fun getExperiences(): List<Experience> {
        val experiences =
            List(2) {
                Experience(
                    imageRes = getResId("experience_image_$it", R.drawable::class.java),
                    titleRes = getResId("experience_title_$it", R.string::class.java),
                    locationRes = getResId("experience_location_$it", R.string::class.java),
                )
            }
        return experiences
    }

    override fun getPreferences(): List<Preference> {
        return List(5) {
            Preference(
                icon = getResId("preference_icon_$it", R.drawable::class.java),
                name = getResId("preference_name_$it", R.string::class.java),
            )
        }
    }
}

private fun getResId(
    resName: String,
    c: Class<*>,
): Int {
    return try {
        val idField = c.getDeclaredField(resName)
        idField.getInt(idField)
    } catch (e: Exception) {
        e.printStackTrace()
        -1
    }
}
