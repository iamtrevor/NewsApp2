package com.example.newsapp2.View

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.newsapp2.Retrofit.Post
import com.example.newsapp2.Utils.GetRandomColors

@Composable
fun PostItem(post : Post) {

    val backgroundColor = GetRandomColors().getRandomColors()

    Card(
        modifier = Modifier.padding(8.dp),
        elevation = CardDefaults.cardElevation(16.dp),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {

        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {

            Text(text = post.title, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 8.dp))

            Text(text = post.body, fontWeight = FontWeight.Normal)


        }

    }
}