package com.example.composeplayground.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.composeplayground.R
import com.example.composeplayground.ui.theme.ComposePlaygroundTheme

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
                ProfileScreen(dummyPosts)
            }
        }
    }
}