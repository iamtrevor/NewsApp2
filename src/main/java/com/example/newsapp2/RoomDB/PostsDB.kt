package com.example.newsapp2.RoomDB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.newsapp2.Retrofit.Post

@Database(entities = [Post::class], version = 1)
abstract class PostsDB  : RoomDatabase() {

    abstract val postsDao: PostsDao

    //singleton design pattern
    companion object {

        @Volatile
        private var INSTANCE: PostsDB? = null

        fun getInstance(context: Context): PostsDB {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        PostsDB::class.java,
                        "posts_database"
                    ).build()
                    INSTANCE = instance
                }
                return instance
                }

            }


        }
    }





