package com.samuelokello.mindease.presentation.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Tip(
    @StringRes val titleRes: Int,
    val dayRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int,
)
