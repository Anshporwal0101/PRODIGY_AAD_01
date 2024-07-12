package com.example.stopwatch.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//@Composable
//fun stopWatchUi()
//{
//   Box(
//       modifier = Modifier
//           .background(
//               brush = Brush.verticalGradient(
//                   colors = listOf(
//                       Color(66, 165, 245, 255),
//                       Color(38, 198, 218, 255)
//                   ),
//                   startY = 0f,
//                   endY = 2000f // Adjust the end position based on your requirement
//               )
//           )
//           .fillMaxWidth()
//           .fillMaxHeight()
//   ){
//       Box(
//           modifier = Modifier
//               .align(Alignment.Center)
//               .padding(20.dp)
//               .border(6.dp,Color.Magenta, CircleShape)
//               .height(350.dp)
//               .width(350.dp)
//       ){
//           StopwatchApp()
//       }
//   }
//}
//
//@Composable
//fun StopwatchApp() {
//    var time by remember { mutableStateOf(0L) }
//    var isRunning by remember { mutableStateOf(false) }
//    var startTime by remember { mutableStateOf(System.currentTimeMillis()) }
//    val scope = rememberCoroutineScope()
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        horizontalAlignment= Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Text(
//            text = formatTime(time),
//            fontSize = 60.sp,
//            fontWeight = FontWeight.Bold
//        )
//        Spacer(modifier = Modifier.height(32.dp))
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceEvenly
//        ) {
//            Button(
//                onClick = {
//                    isRunning = !isRunning
//                    if (isRunning) {
//                        startTime = System.currentTimeMillis()
//                        scope.launch {
//                            while (isRunning) {
//                                time = System.currentTimeMillis() - startTime
//                                delay(10) // Update every 10 milliseconds for smoother display
//                            }
//                        }
//                    }
//                },
//                colors = ButtonDefaults.buttonColors(if (isRunning) Color.Red else Color.Green)
//            ) {
//                Text(
//                    text = if (isRunning) "Pause" else "Start",
//                    color = Color.White
//                )
//            }
//            Spacer(modifier = Modifier.width(16.dp))
//            Button(
//                onClick = {
//                    isRunning = false
//                    time = 0
//                },
//                colors = ButtonDefaults.buttonColors(Color.DarkGray)
//            ) {
//                Text(
//                    text = "Reset",
//                    color = Color.White
//                )
//            }
//        }
//    }
//}
//
//fun formatTime(timeInMillis: Long): String {
//    val totalSeconds = timeInMillis / 1000
//    val minutes = totalSeconds / 60
//    val seconds = totalSeconds % 60
//    val milliseconds = (timeInMillis % 1000) / 10
//
//    return String.format("%02d:%02d:%02d", minutes, seconds, milliseconds)
//}
