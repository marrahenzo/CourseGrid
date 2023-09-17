package com.example.coursegrid.data

import com.example.coursegrid.R

class DataSource() {
    fun loadTopics(): List<Topic> {
        return listOf<Topic>(
            Topic(R.string.architecture, 12, R.drawable.architecture),
            Topic(R.string.business, 34, R.drawable.business),
            Topic(R.string.crafts, 56, R.drawable.crafts),
            Topic(R.string.design, 78, R.drawable.design),
            Topic(R.string.culinary, 910, R.drawable.culinary),
            Topic(R.string.drawing, 1112, R.drawable.drawing),
            Topic(R.string.fashion, 1314, R.drawable.fashion),
            Topic(R.string.film, 1516, R.drawable.film),
            Topic(R.string.gaming, 1718, R.drawable.gaming),
            Topic(R.string.lifestyle, 1920, R.drawable.lifestyle),
            Topic(R.string.music, 2122, R.drawable.music),
            Topic(R.string.painting, 2324, R.drawable.painting),
            Topic(R.string.photography, 2526, R.drawable.photography),
            Topic(R.string.tech, 2728, R.drawable.tech),
            Topic(R.string.webdev, 2728, R.drawable.webdev),
            Topic(R.string.mobiledev, 2728, R.drawable.mobile),
            Topic(R.string.programming, 2728, R.drawable.coding),
            Topic(R.string.videoediting, 2728, R.drawable.video),
            Topic(R.string.threedmodeling, 2728, R.drawable.blender),
            Topic(R.string.electronics, 2728, R.drawable.electronics),
            Topic(R.string.carpentry, 2728, R.drawable.carpentry),
            Topic(R.string.climatology, 2728, R.drawable.climate),
            Topic(R.string.audio, 2728, R.drawable.audio)
        )
    }
}