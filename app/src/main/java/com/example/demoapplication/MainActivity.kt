package com.example.demoapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demoapplication.ui.theme.DemoApplicationTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(20.dp)
                    ) {
                        var a by remember {
                            mutableStateOf("")
                        }
                        var b by remember {
                            mutableStateOf("")
                        }
                        var c by remember {
                            mutableStateOf("")
                        }
                        var d by remember {
                            mutableStateOf("")
                        }
//                        Image(painterResource(id = R.drawable.img) , contentDescription = "", Modifier.size(300.dp))
                        Text(
                            fontSize = 32.sp,
                            text = "Sign up.",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 5.dp, bottom = 5.dp),
                            textAlign = TextAlign.Start,
                            fontWeight = FontWeight(700),

                            )
                        Text(
                            fontSize = 16.sp,
                            text = "It's quick and easy.",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Start
                        )
                        Divider(modifier = Modifier.padding(top = 8.dp, bottom = 5.dp))

                        Row {
                            TextField(
                                value = a,
                                onValueChange = { a = it },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f)
                                    .padding(4.dp),
                                placeholder = {
                                    Text("Enter username")
                                })

                            TextField(
                                value = b,
                                onValueChange = { b = it },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f)
                                    .padding(4.dp),
                                placeholder = {
                                    Text("Enter password")
                                })
                        }
                        Row {
                            TextField(
                                value = c,
                                onValueChange = { c = it },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f)
                                    .padding(4.dp),
                                placeholder = {
                                    Text("Enter Mobile Number")
                                })
                        }
                        Row {
                            TextField(
                                value = d,
                                onValueChange = { d = it },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f)
                                    .padding(4.dp),
                                placeholder = {
                                    Text("Enter New Password")
                                })

                        }
                        Text(
                            fontSize = 12.sp,
                            modifier = Modifier
                                .padding(4.dp),
                            text =
                            "By clicking Sign Up, you agree to our Terms, Privacy Policy and Cookies Policy. You may receive SMS notifications from us and can opt out at any time.",
                        )

                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(Color(0xFF358856)),
                            modifier = Modifier
                                .size(width = 200.dp, height = 50.dp)
                                .padding(top = 10.dp)
                        ) {
                            Text(text = "Sign up")
                        }

                    }
                }
            }
        }
    }
}
