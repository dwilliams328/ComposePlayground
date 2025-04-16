package com.example.composeplayground.ui

import android.content.Intent
import android.graphics.fonts.Font
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeplayground.R
import com.example.composeplayground.ui.theme.ComposePlaygroundTheme
import androidx.core.net.toUri

class MainActivity : ComponentActivity() {
    private val dummyPosts = listOf(
        UserPost("Compose UI", "2 hours ago", R.drawable.jetpack_compose_icon),
        UserPost("Jetpack Compose", "1 day ago", R.drawable.android_development),
        UserPost("Small Project", "3 days ago"),
        UserPost("New Keyboard", "5 day ago", R.drawable.keyboard),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposePlaygroundTheme {
                val listOfTexts = listOf(
                    "One",
                    "Two",
                    "Three",
                    "Four",
                    "Five",
                    "One",
                    "Two",
                    "Three",
                    "Four",
                    "Five",
                    "One",
                    "Two",
                    "Three",
                    "Four",
                    "Five",
                    "One",
                    "Two",
                    "Three",
                    "Four",
                    "Five",
                    "One",
                    "Two",
                    "Three",
                    "Four",
                    "Five"
                )
                val context = LocalContext.current
                ProfileScreen(dummyPosts)
//                LazyColumn(
//                    verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .background(Color.Red)
//                        .padding(top = 24.dp)
//                ) {
//                    item {
//                        Text(
//                            text = "HEADER",
//                            fontSize = 32.sp,
//                            fontStyle = FontStyle.Italic,
//                            fontFamily = FontFamily.Cursive,
//                            fontWeight = FontWeight.Bold,
//                            modifier = Modifier.padding(top = 16.dp)
//                        )
//                    }
////                    listOfTexts.forEach { it ->
//                    items(listOfTexts) {
//
//                        Text(
//                            text = it,
//                            modifier = Modifier
////                                .padding(vertical = 16.dp)
//                                .background(Color.White)
//                                .clickable {
//                                    context.startActivity(
//                                        Intent(
//                                            Intent.ACTION_VIEW,
//                                            "https://www.google.com".toUri()
//                                        )
//                                    )
//                                }
//                                .padding(horizontal = 16.dp, vertical = 8.dp)
//
//                        )
//                    }
//
////                    }
////                    Text("One", modifier = Modifier.background(Color.Blue))//.padding(30.dp))
////                    Text("Two")
////                    Text("Three")
////                    Text("Four")
////                    Text("Five")
//                }
                //ProfileScreen(dummyPosts)
            }
        }
    }
}