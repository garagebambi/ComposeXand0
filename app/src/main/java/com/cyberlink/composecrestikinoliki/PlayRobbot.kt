package com.cyberlink.composecrestikinoliki

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun PlayRobbot(robbotViewModel: RobbotViewModel = viewModel()) {

    var buttonSize = 90.dp


    Box(
        modifier = Modifier
            .fillMaxSize()
            .border(2.dp, Color.Red)
            .background(Color.Yellow)
    ) {

        Row(
            modifier = Modifier
                .padding(top = 50.dp)
                .fillMaxWidth(), horizontalArrangement = Arrangement.Center
        ) {

            Text(
                text = robbotViewModel.state.value.resultText, fontSize = 45.sp
            )

        }

        Column(
            modifier = Modifier
                .border(2.dp, Color.Red)
                .align(Alignment.Center), horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .border(2.dp, Color.Red)
            ) {

                Box(modifier = Modifier
                    .border(2.dp, Color.Red)
                    .background(Color.Blue)
                    .size(buttonSize)
                    .clickable {

                        robbotViewModel.click(0)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = robbotViewModel.state.value.field[0],
                        fontSize = 30.sp
                    )
                }

                Box(modifier = Modifier
                    .border(2.dp, Color.Red)
                    .background(Color.Blue)
                    .size(buttonSize)
                    .clickable {

                        robbotViewModel.click(1)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = robbotViewModel.state.value.field[1],
                        fontSize = 30.sp
                    )
                }

                Box(modifier = Modifier
                    .border(2.dp, Color.Red)
                    .background(Color.Blue)
                    .size(buttonSize)
                    .clickable {

                        robbotViewModel.click(2)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = robbotViewModel.state.value.field[2],
                        fontSize = 30.sp
                    )
                }

            }

            Row(
                modifier = Modifier
                    .border(2.dp, Color.Red)
            ) {

                Box(modifier = Modifier
                    .border(2.dp, Color.Red)
                    .background(Color.Blue)
                    .size(buttonSize)
                    .clickable {

                        robbotViewModel.click(3)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = robbotViewModel.state.value.field[3],
                        fontSize = 30.sp
                    )
                }

                Box(modifier = Modifier
                    .border(2.dp, Color.Red)
                    .background(Color.Blue)
                    .size(buttonSize)
                    .clickable {

                        robbotViewModel.click(4)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = robbotViewModel.state.value.field[4],
                        fontSize = 30.sp
                    )
                }

                Box(modifier = Modifier
                    .border(2.dp, Color.Red)
                    .background(Color.Blue)
                    .size(buttonSize)
                    .clickable {

                        robbotViewModel.click(5)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = robbotViewModel.state.value.field[5],
                        fontSize = 30.sp
                    )
                }

            }

            Row(
                modifier = Modifier
                    .border(2.dp, Color.Red)
            ) {

                Box(modifier = Modifier
                    .border(2.dp, Color.Red)
                    .background(Color.Blue)
                    .size(buttonSize)
                    .clickable {

                        robbotViewModel.click(6)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = robbotViewModel.state.value.field[6],
                        fontSize = 30.sp
                    )
                }

                Box(modifier = Modifier
                    .border(2.dp, Color.Red)
                    .background(Color.Blue)
                    .size(buttonSize)
                    .clickable {

                        robbotViewModel.click(7)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = robbotViewModel.state.value.field[7],
                        fontSize = 30.sp
                    )
                }

                Box(modifier = Modifier
                    .border(2.dp, Color.Red)
                    .background(Color.Blue)
                    .size(buttonSize)
                    .clickable {

                        robbotViewModel.click(8)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = robbotViewModel.state.value.field[8],
                        fontSize = 30.sp
                    )
                }

            }


        }
        Row(
            modifier = Modifier
                .padding(75.dp)
                .align(Alignment.BottomCenter)
        ) {

            Box(
                modifier = Modifier
                    .border(2.dp, Color.Red)
                    .background(Color.Blue)
                    .padding(20.dp)
            ) {

                Text(text = "Restart", fontSize = 30.sp, modifier = Modifier
                    .align(Alignment.Center)
                    .clickable {

                        robbotViewModel.restarter()

                    }
                )


            }

        }


    }


}