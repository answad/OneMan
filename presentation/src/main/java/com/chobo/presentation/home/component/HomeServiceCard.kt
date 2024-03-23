package com.chobo.presentation.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chobo.presentation.R


@Composable
fun HomeServiceCard(
    topText: String,
    bottomText: String,
    navigateToDestination: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .width(350.dp)
            .height(92.dp)
            .background(color = Color(0xFFF8F8F9), shape = RoundedCornerShape(size = 16.dp))
            .padding(start = 20.dp, top = 24.dp, end = 20.dp, bottom = 24.dp)
            .clickable {
                navigateToDestination()
            },
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .width(310.dp)
                .height(44.dp),
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .width(310.dp)
                    .height(19.dp),
            ) {
                Text(
                    text = topText,

                    modifier = Modifier
                        .height(19.dp),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF171717),
                        textAlign = TextAlign.Center,
                    )
                )
                Image(
                    painter = painterResource(id = R.drawable.right_arrow),
                    contentDescription = "image description",
                    contentScale = ContentScale.None
                )
            }
            Text(
                text = bottomText,
                modifier = Modifier
                    .width(231.dp),
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFFB4B5B7),
                )
            )
        }
    }
}
