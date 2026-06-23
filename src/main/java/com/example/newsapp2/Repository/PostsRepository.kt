package com.example.newsapp2.Repository

import android.content.Context
import com.example.newsapp2.Retrofit.Post
import com.example.newsapp2.Retrofit.RetrofitInstance
import com.example.newsapp2.RoomDB.PostsDB
import com.example.newsapp2.RoomDB.PostsDao


class PostsRepository(private val context : Context) {


    //get posts from the online api
    suspend fun getPosts() : List<Post>{
        return RetrofitInstance.apiService.getPosts()
    }


    //from room database

    //instance of room db
    val roomDB = PostsDB.getInstance(context)

    //instance of dao
    val dao = roomDB.postsDao

    //get posts from room db
    suspend fun getPostsFromRoomDB() : List<Post>{
        return dao.getPosts()
    }

    //insert note into room db fun
    suspend fun insertPosts(posts: List<Post>){
        dao.insertPosts(posts)
    }




}