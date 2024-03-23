package com.chobo.presentation.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chobo.presentation.R

@Composable
fun NearbyEcoFriendlyMart(
    topText: String,
    addressText: String,
    firstTag: String,
    secondTag: String
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(18.dp, Alignment.Top),
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color(0xFFEFF0F2),
                shape = RoundedCornerShape(size = 16.dp)
            )
            .width(293.dp)
            .height(176.dp)
            .background(color = Color(0xFFF8F8F9), shape = RoundedCornerShape(size = 16.dp))
            .padding(start = 18.dp, top = 18.dp, end = 18.dp, bottom = 18.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .width(257.dp)
                .height(90.dp),
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .width(257.dp)
                    .height(90.dp),
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .width(245.dp)
                        .height(48.dp),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.martimage),
                        contentDescription = "image description",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .width(48.dp)
                            .height(48.dp),
                    )
                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .height(44.dp),
                    ) {
                        Text(
                            text = topText,
                            modifier = Modifier
                                .height(19.dp),
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF171717),
                                textAlign = TextAlign.Center,
                            )
                        )
                        Text(
                            text = addressText,
                            modifier = Modifier
                                .height(17.dp),
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF8F9094),
                                textAlign = TextAlign.Center,
                            )
                        )
                    }
                }

                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .width(130.dp)
                        .height(30.dp),
                ) {
                    NearbyEcoFriendlyMartTag(text = firstTag)
                    NearbyEcoFriendlyMartTag(text = secondTag)
                }
            }
        }
        Box(
            modifier = Modifier
                .padding(0.dp)
                .width(257.dp)
                .height(1.dp)
                .background(color = Color(0xFFEFF0F2))
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .width(257.dp),
        ) {
            Text(
                text = stringResource(id = R.string.see_more_stores, topText),
                modifier = Modifier
                    .width(148.dp)
                    .height(14.dp),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF2870FB),
                    textAlign = TextAlign.Center,
                )
            )
            Image(
                modifier = Modifier
                    .padding(0.dp)
                    .width(14.dp)
                    .height(14.dp),
                painter = painterResource(id = R.drawable.arrow_back_ios_new),
                contentDescription = "image description",
            )
        }

    }
}
@Composable
fun NearbyEcoFriendlyMartTag(
    text: String
) {
    Row(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color(0xFFBCD3FE),
                shape = RoundedCornerShape(size = 16.dp)
            )
            .height(30.dp)
            .background(color = Color(0xFFEAF1FF), shape = RoundedCornerShape(size = 16.dp))
            .padding(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text,
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF2870FB),
                textAlign = TextAlign.Center,
            )
        )
    }
}

