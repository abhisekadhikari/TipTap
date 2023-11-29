package com.abhitech.tiptap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abhitech.tiptap.ui.theme.TipTapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                TopHeader()
            }
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

//@Preview
@Composable
fun TopHeader(totalPerPerson: Double = 200.0) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .clip(shape = CircleShape.copy(all = CornerSize(12.dp))),
        // OR
        //.clip(shape = RoundedCornerShape(CornerSize(12.dp))),
        color = Color(229, 210, 246, 255)
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val total = "%.2f".format(totalPerPerson)
            Text(
                text = "Total Per Person",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace
            )
            Text(
                text = "$$total",
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.ExtraBold
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
fun MainContent() {
    Surface(
        modifier = Modifier
            .padding(2.dp)
            .fillMaxWidth()
            .height(100.dp),
        shape = RoundedCornerShape(corner = CornerSize(8.dp)),
        color = Color.White,
        border = BorderStroke(width = 2.dp, color = Color.Red)
    ) {

    }
}

//@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TipTapTheme {
        MyApp {

        }
    }
}