package com.example.newsapp2.View

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.newsapp2.Retrofit.Post

@Composable
fun PostItemList(posts : List<Post>){

    //use lazy column
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {

        items(posts){
            post -> PostItem(post = post)
        }
        }

}

