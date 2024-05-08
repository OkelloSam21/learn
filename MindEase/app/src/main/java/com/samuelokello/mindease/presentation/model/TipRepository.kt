package com.samuelokello.mindease.presentation.model

import com.samuelokello.mindease.R

object TipRepository {
    val tips =
        List(30) { index ->
            Tip(
                titleRes = getResId("tip_title_${index + 1}", R.string::class.java),
                dayRes = index,
                descriptionRes = getResId("tip_description_${index + 1}", R.string::class.java),
                imageRes = getResId("img_${index + 1}", R.drawable::class.java),
            )
        }

    // This function is used to get the resource id of a string or drawable resource
    private fun getResId(
        resName: String,
        c: Class<*>,
    ): Int {
        try {
            val idField = c.getDeclaredField(resName)
            return idField.getInt(idField)
        } catch (e: Exception) {
            e.printStackTrace()
            return -1
        }
    }
}
