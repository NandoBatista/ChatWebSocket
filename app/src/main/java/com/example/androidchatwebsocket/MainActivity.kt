package com.example.androidchatwebsocket

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.androidchatwebsocket.ui.ChatApp
import com.example.androidchatwebsocket.ui.theme.AndroidChatWebSocketTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidChatWebSocketTheme {
                ChatApp()
            }
        }
    }
}