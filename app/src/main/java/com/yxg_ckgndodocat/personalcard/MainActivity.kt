package com.yxg_ckgndodocat.personalcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yxg_ckgndodocat.personalcard.ui.theme.PersonalCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonalCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PersonalCardView()
                }
            }
        }
    }
}

@Composable
fun PersonalCardView() {
    val imageAvatar = painterResource(id = R.drawable.ic_avatar)
    val imageEmail = painterResource(id = R.drawable.ic_email)
    val imagePhone = painterResource(id = R.drawable.ic_phone)
    val imageTwitter = painterResource(id = R.drawable.ic_twitter)

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .weight(0.7f)
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(painter = imageAvatar, contentDescription = null)
            Text(
                text = "DoDoCat",
                fontSize = 36.sp,
                modifier = Modifier.padding(8.dp)
            )
            Text(text = "Mod Developer")
        }
        Column(
            modifier = Modifier
                .weight(0.3f)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column {

                Column (
                    modifier = Modifier.padding(bottom = 20.dp),
                ) {
                    Row {
                        Image(painter = imagePhone, contentDescription = null, Modifier.size(25.dp))
                        Text(
                            text = "+86 12345678",
                            textAlign = TextAlign.Justify
                        )
                    }
                }
                Column(
                    modifier = Modifier.padding(bottom = 20.dp)
                ) {
                    Row {
                        Image(painter = imageTwitter, contentDescription = null, Modifier.size(25.dp))
                        Text(text = "@realcookgreen", textAlign = TextAlign.Center)
                    }
                }
                Column(
                ) {
                    Row {
                        Image(painter = imageEmail, contentDescription = null, Modifier.size(25.dp))
                        Text(text = "contactme@gmail.com")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PersonalCardPreview() {
    PersonalCardTheme {
        PersonalCardView()
    }
}