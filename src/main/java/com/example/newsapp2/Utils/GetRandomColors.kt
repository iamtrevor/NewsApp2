package com.example.newsapp2.Utils

import androidx.compose.ui.graphics.Color
import kotlin.random.Random

class GetRandomColors {

    fun getRandomColors() : Color{
        val red = Random.nextInt(256)
        val green = Random.nextInt(256)
        val blue = Random.nextInt(256)

        return Color(red, green, blue)
    }

}