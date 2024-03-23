package com.chobo.presentation.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.chobo.presentation.R
import com.chobo.presentation.chatBot.navigation.navigateToChatBot
import com.chobo.presentation.health.navigation.navigateToHealth
import com.chobo.presentation.home.navigation.navigateToChatSupport

@Composable
fun HomeMain(navController: NavController){
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .height(73.dp)
            .padding(start = 20.dp, top = 12.dp, end = 20.dp, bottom = 12.dp)
    ) {
        Column(
            modifier = Modifier
                .width(331.dp)
                .height(49.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                text = stringResource(id = R.string.date, 2023, 12, 22),
                modifier = Modifier
                    .width(108.dp)
                    .height(17.dp),
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFFA5A6A9),
                    textAlign = TextAlign.Start,
                )
            )
            Text(
                text = stringResource(id = R.string.for_service, "이앱젬"),
                modifier = Modifier
                    .width(331.dp)
                    .height(24.dp),
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF171717),
                    textAlign = TextAlign.Start,
                )
            )
        }
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 16.dp, end = 20.dp),
    ) {
        Spacer(modifier = Modifier.size(12.dp))
        HomeServiceCard(
            topText = "나를 위한 지원 알아보러가기",
            bottomText = "나를 위한 지원 사업 알아보고 지원금 받자!",
            navigateToDestination = { navController.navigateToChatSupport() }
        )
        Spacer(modifier = Modifier.size(12.dp))
        HomeServiceCard(
            topText = "내 건강을 위해 식단 체크해보기",
            bottomText = "식단을 기록하고 돌아보고 건강도 챙기자!",
            navigateToDestination = { navController.navigateToHealth() }
        )
        Spacer(modifier = Modifier.size(12.dp))
        HomeServiceCard(
            topText = "지친 내마음, 달래줄 곳이 필요하다면?",
            bottomText = "무거운 이야기들, 챗봇에게 털어놓자",
            navigateToDestination = { navController.navigateToChatBot() }
        )
    }
    Spacer(modifier = Modifier.size(28.dp))
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .width(598.dp)
            .height(209.dp)
            .padding(start = 20.dp),
    ) {
        Text(
            text = stringResource(id = R.string.near_macket),

            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF171717),
                textAlign = TextAlign.Center,
            )
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.Top,
            modifier = Modifier
                .height(176.dp),
        ) {
            items(1) {
                NearbyEcoFriendlyMart(
                    topText = "초록마을",
                    addressText = "서울 광진구 뚝섬로 522 심희빌딩",
                    firstTag = "식자재",
                    secondTag = "그린푸드"
                )
                Spacer(modifier = Modifier.size(18.dp))
                NearbyEcoFriendlyMart(
                    topText = "초코초코",
                    addressText = "광주 소프트웨어고-493-21번지",
                    firstTag = "치킨",
                    secondTag = "피자"
                )
            }
        }
    }
}