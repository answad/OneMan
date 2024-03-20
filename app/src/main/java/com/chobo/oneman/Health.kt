package com.chobo.oneman

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val Health = "건강"

fun NavController.navigateToHealth() {
    this.navigate(Health)
}

fun NavGraphBuilder.health(
    paddingValues: PaddingValues
) {
    composable(Health) {
        Spacer(modifier = Modifier.padding(top = paddingValues.calculateTopPadding()))
        TopAppBar(Health)
    }
}

@Preview
@Composable
fun Health() {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 72.dp, start = 20.dp, end = 20.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxWidth()
                .height(49.dp),
        ) {
            Text(
                text = "2024년 01월 16일",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFFA5A6A9),
                    textAlign = TextAlign.Center,
                )
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "이주영님의 영양 상태",

                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF171717),
                        textAlign = TextAlign.Center,
                    )
                )
            }
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .width(350.dp)
                .height(137.dp),
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .width(350.dp)
                    .height(20.dp),
            ) {
                Text(
                    text = "2024년 1월 1주차",
                    modifier = Modifier
                        .height(17.dp),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF5A5A5C),
                        textAlign = TextAlign.Center,
                    )
                )
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .height(20.dp),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.arrow_front_ios_new),
                        contentDescription = "image description",
                        contentScale = ContentScale.None
                    )
                    Image(
                        painter = painterResource(id = R.drawable.arrow_front_ios_new),
                        contentDescription = "image description",
                        modifier = Modifier.graphicsLayer(rotationY = 180f),
                        contentScale = ContentScale.None
                    )
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .height(20.dp)
                            .background(
                                color = Color(0xFFEFF0F2),
                                shape = RoundedCornerShape(size = 16.dp)
                            ),
                    ) {
                        Text(
                            text = "주",
                            modifier = Modifier.width(27.dp),
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF76777B),
                                textAlign = TextAlign.Center,
                            )
                        )
                    }
                }
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .width(350.dp)
                    .height(109.dp)
                    .padding(top = 12.dp, bottom = 12.dp),
            ) {
                // Child views.
            }
        }
    }
}
