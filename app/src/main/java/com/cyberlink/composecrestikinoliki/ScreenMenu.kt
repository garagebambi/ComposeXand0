package com.cyberlink.composecrestikinoliki

import android.app.Activity
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ScreenMenu(navigat: NavHostController) {

    val context = LocalContext.current

    var btnSizeW = 250.dp
    var btnSizeH = 100.dp

    Box(
        modifier = Modifier
            .background(Color.Yellow)
            .fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .padding(top = 75.dp, bottom = 75.dp)
                .border(2.dp, Color.Black)
                .background(Color.Blue)
                .align(Alignment.Center)
                .fillMaxHeight(), verticalArrangement = Arrangement.SpaceAround
        ) {

            Card(
                modifier = Modifier
                    .size(btnSizeW, btnSizeH),
                backgroundColor = Color.Red,
                shape = RoundedCornerShape(25.dp),
                border = BorderStroke(2.dp, Color.Black),
                elevation = 45.dp
            ) {

                Box(modifier = Modifier
                    .fillMaxSize()
                    .clickable {

                        navigat.navigate("Play with robbot")

                    }) {

                    Text(
                        text = "Simple player",
                        fontSize = 25.sp,
                        modifier = Modifier
                            .align(Center)

                    )


                }
            }



            Card(
                modifier = Modifier
                    .size(btnSizeW, btnSizeH),
                backgroundColor = Color.Red,
                shape = RoundedCornerShape(25.dp),
                border = BorderStroke(2.dp, Color.Black),
                elevation = 45.dp
            ) {

                Box(modifier = Modifier
                    .fillMaxSize()
                    .clickable {

                        navigat.navigate("Play with friend")

                    }) {

                    Text(
                        text = "Play with friend",
                        fontSize = 25.sp,
                        modifier = Modifier
                            .align(Center)
                    )


                }
            }
            Card(
                modifier = Modifier
                    .size(btnSizeW, btnSizeH),
                backgroundColor = Color.Red,
                shape = RoundedCornerShape(25.dp),
                border = BorderStroke(2.dp, Color.Black),
                elevation = 45.dp
            ) {

                Box(modifier = Modifier
                    .fillMaxSize()
                    .clickable {

                        (context as Activity).finish()

                    }) {

                    Text(
                        text = "Exit",
                        fontSize = 25.sp,
                        modifier = Modifier
                            .align(Center)
                    )


                }
            }

        }
    }

}