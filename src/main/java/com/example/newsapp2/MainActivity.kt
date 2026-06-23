package com.example.newsapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import com.example.newsapp2.Repository.PostsRepository
import com.example.newsapp2.View.PostScreen
import com.example.newsapp2.ViewModel.PostsViewModel
import com.example.newsapp2.ViewModel.PostsViewModelFactory
import com.example.newsapp2.ui.theme.NewsApp2Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //retrofit


        //repository
        val repository = PostsRepository(applicationContext)

        //viewModelFactory
        val viewModelFactory = PostsViewModelFactory(repository)

        //viewModel
        val postsViewModel = ViewModelProvider(
            this,
            viewModelFactory
        )[PostsViewModel::class.java]


        setContent {
            NewsApp2Theme {

                Column {
                    Header()
                    PostScreen(postsViewModel)
                }


            }
        }
    }
}



@Composable
fun Header(){

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "My News App", fontWeight = FontWeight.Bold)
        Text(text = "Your most reliable news source")
    }

}
