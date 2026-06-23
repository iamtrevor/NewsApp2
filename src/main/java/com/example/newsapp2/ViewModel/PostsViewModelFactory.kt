package com.example.newsapp2.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newsapp2.Repository.PostsRepository

class PostsViewModelFactory(private val repository: PostsRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PostsViewModel::class.java)) {

            @Suppress("UNCHECKED_CAST")
            return PostsViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

