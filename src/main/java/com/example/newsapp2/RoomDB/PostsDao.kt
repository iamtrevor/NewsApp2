package com.example.newsapp2.RoomDB

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.newsapp2.Retrofit.Post


@Dao
interface PostsDao {

    @Insert
    suspend fun insertPosts(posts: List<Post>)

    @Query("SELECT * FROM post_table")
    suspend fun getPosts(): List<Post>



}