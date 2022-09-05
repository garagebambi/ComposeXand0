package com.cyberlink.composecrestikinoliki

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Top
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun MainScreen(gameViewModel: GameViewModel = viewModel()) {

    var buttonSize = 90.dp


    Box(
        modifier = Modifier
            .fillMaxSize()
            .border(2.dp, Color.Red)
            .background(Color.Gray)
    ) {

        Row(
            modifier = Modifier
                .padding(top = 50.dp)
                .fillMaxWidth(), horizontalArrangement = Arrangement.Center
        ) {

            Text(
                text = gameViewModel.state.value.resultText, fontSize = 45.sp
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

                        gameViewModel.click(0)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = gameViewModel.state.value.field[0],
                        fontSize = 30.sp
                    )
                }

                Box(modifier = Modifier
                    .border(2.dp, Color.Red)
                    .background(Color.Blue)
                    .size(buttonSize)
                    .clickable {

                        gameViewModel.click(1)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = gameViewModel.state.value.field[1],
                        fontSize = 30.sp
                    )
                }

                Box(modifier = Modifier
                    .border(2.dp, Color.Red)
                    .background(Color.Blue)
                    .size(buttonSize)
                    .clickable {

                        gameViewModel.click(2)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = gameViewModel.state.value.field[2],
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

                        gameViewModel.click(3)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = gameViewModel.state.value.field[3],
                        fontSize = 30.sp
                    )
                }

                Box(modifier = Modifier
                    .border(2.dp, Color.Red)
                    .background(Color.Blue)
                    .size(buttonSize)
                    .clickable {

                        gameViewModel.click(4)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = gameViewModel.state.value.field[4],
                        fontSize = 30.sp
                    )
                }

                Box(modifier = Modifier
                    .border(2.dp, Color.Red)
                    .background(Color.Blue)
                    .size(buttonSize)
                    .clickable {

                        gameViewModel.click(5)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = gameViewModel.state.value.field[5],
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

                        gameViewModel.click(6)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = gameViewModel.state.value.field[6],
                        fontSize = 30.sp
                    )
                }

                Box(modifier = Modifier
                    .border(2.dp, Color.Red)
                    .background(Color.Blue)
                    .size(buttonSize)
                    .clickable {

                        gameViewModel.click(7)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = gameViewModel.state.value.field[7],
                        fontSize = 30.sp
                    )
                }

                Box(modifier = Modifier
                    .border(2.dp, Color.Red)
                    .background(Color.Blue)
                    .size(buttonSize)
                    .clickable {

                        gameViewModel.click(8)

                    }) {

                    Text(
                        modifier = Modifier
                            .align(Alignment.Center),
                        text = gameViewModel.state.value.field[8],
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

                        gameViewModel.restarter()

                    }
                )


            }

        }


    }


}