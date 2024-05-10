package com.samuelokello.practiceone.domain

import com.samuelokello.practiceone.data.Experience
import com.samuelokello.practiceone.data.Preference

interface HomeRepository {
    fun getExperiences(): List<Experience>
    fun getPreferences(): List<Preference>
}