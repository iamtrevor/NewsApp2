package com.example.newsapp2.Retrofit

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "post_table")
data class Post(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title : String,
    val body : String
)
