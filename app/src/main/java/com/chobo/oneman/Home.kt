package com.chobo.oneman

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
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
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

const val mainRoute = "홈"


fun NavController.navigateToHome() {
    this.navigate(mainRoute)
}

fun NavGraphBuilder.home(
    navController: NavHostController,
    paddingValues: PaddingValues
) {
    composable(mainRoute) {
        Spacer(modifier = Modifier.padding(top = paddingValues.calculateTopPadding()))
        TopAppBar(mainRoute)
        Home(navController = navController)
    }
}


@Composable
fun Home(navController:NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 48.dp)
    ) {
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
                    text = "2024년 01월 16일",
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
                    text = "이앱잼님을 위해 이런 서비스를 준비했어요",
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
                navController = navController,
                navigationRoute = "지원",
            )
            Spacer(modifier = Modifier.size(12.dp))
            HomeServiceCard(
                topText = "내 건강을 위해 식단 체크해보기",
                bottomText = "식단을 기록하고 돌아보고 건강도 챙기자!",
                navController = navController,
                navigationRoute = "식단",
            )
            Spacer(modifier = Modifier.size(12.dp))
            HomeServiceCard(
                topText = "지친 내마음, 달래줄 곳이 필요하다면?",
                bottomText = "무거운 이야기들, 챗봇에게 털어놓자",
                navController = navController,
                navigationRoute = "마음치유",
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
                text = "내 주변 친환경 마트",

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
}

@Composable
fun HomeServiceCard(
    topText: String,
    bottomText: String,
    navController: NavHostController,
    navigationRoute: String
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
                navController.navigate(navigationRoute)
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
                text = "“${topText}”의 매장 정보 더 보기",
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

