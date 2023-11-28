package com.abhitech.tiptap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abhitech.tiptap.ui.theme.TipTapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DashBoard()
        }
    }
}

@Composable
fun DashBoard() {
    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            DisplayTip()
        }
    }
}


@Composable
fun DisplayTip() {
    Surface(
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth(),
    ) {
        Card(
            modifier = Modifier
                .padding(15.dp),
            colors = CardDefaults.cardColors(
                Color(228, 208, 246)
            ),
            shape = RoundedCornerShape(5.dp),
        ) {
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Total Per Person")
                Text(text = "Total Per Person")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TipTapTheme {
        DashBoard()
    }
}