package com.samuelokello.practiceone.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector

data class Experience(
    @DrawableRes val imageRes: Int,
    @StringRes val titleRes: Int,
    val iconRes: ImageVector,
    @StringRes val locationRes: Int
)
