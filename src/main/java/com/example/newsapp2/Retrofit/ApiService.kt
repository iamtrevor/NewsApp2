package com.example.newsapp2.Retrofit

import retrofit2.http.GET

interface ApiService {

    //append the endpoint to the base url
    @GET("posts")
    suspend fun getPosts(): List<Post>

}