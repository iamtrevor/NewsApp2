package com.example.newsapp2.ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp2.Repository.PostsRepository
import com.example.newsapp2.Retrofit.Post
import kotlinx.coroutines.launch

class PostsViewModel(private val postsRepository: PostsRepository) : ViewModel() {

    //posts that will be displayed
    var posts by mutableStateOf<List<Post>>(emptyList())
        private set


    //posts from online api
    var postsFromOnlineApi by mutableStateOf<List<Post>>(emptyList())
        private set


    //posts from room database
    var postsFromRoomDB by mutableStateOf<List<Post>>(emptyList())
        private set




    init {
        viewModelScope.launch {

            try {

                //posts from online sources
                postsFromOnlineApi = postsRepository.getPosts()

                //once postsFromOnlineApi has been loaded
                //insert into room db
                postsRepository.insertPosts(postsFromOnlineApi)


                posts = postsFromOnlineApi

            } catch (e : Exception){

                //posts from room
                postsFromRoomDB = postsRepository.getPostsFromRoomDB()

                posts = postsFromRoomDB
            }

        }
    }



}