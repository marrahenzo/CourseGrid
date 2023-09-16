package com.example.coursegrid.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val title: Int,
    val amountOfCourses: Int,
    @DrawableRes val image: Int
)
