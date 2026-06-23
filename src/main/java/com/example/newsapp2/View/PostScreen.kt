package com.example.newsapp2.View

import androidx.compose.runtime.Composable
import com.example.newsapp2.ViewModel.PostsViewModel

@Composable
fun PostScreen(postsViewModel: PostsViewModel){

    val posts = postsViewModel.posts
    PostItemList(posts = posts)

}