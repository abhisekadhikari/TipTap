package com.abhitech.tiptap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.abhitech.tiptap.ui.theme.TipTapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

// CONTAINER FUNCTION ======>

@Composable
fun MyApp(content: @Composable () -> Unit) {
    TipTapTheme {
        Surface {
            content()
        }
    }
}

// <=========





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TipTapTheme {
        MyApp {
            Text(text = "Hello World!")
        }
    }
}