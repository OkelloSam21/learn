package com.samuelokello.practiceone.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Experience(
    @DrawableRes val imageRes: Int,
    @StringRes val titleRes: Int,
//    val icon: ImageVector,
    @StringRes val locationRes: Int,
)
