package com.example.coursegrid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val courseTitle: Int,
    val numberOfCourses: Int,
    @DrawableRes val imageResourceId: Int,
)
