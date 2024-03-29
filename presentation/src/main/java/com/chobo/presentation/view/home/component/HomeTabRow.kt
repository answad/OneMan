package com.chobo.presentation.view.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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


data class SupportOptionData(
    val topText: String,
    val bottomText: String,
)

@Composable
fun SelectOptionList() {
    val selectedTabIndex = remember { mutableStateOf(0) }
    val tabs = listOf("일자리", "주거", "교육", "코로나", "의료", "기타")
    val supprotList = listOf(
        SupportOptionData(topText = "장애학생 취업 지원", bottomText = "100만원"),
        SupportOptionData(topText = "소외계층 청소년을 위한 자립 생활 지원", bottomText = "주거 공간 제공"),
        SupportOptionData(topText = "장애학생 취업 지원", bottomText = "100만원"),
        SupportOptionData(topText = "소외계층 청소년을 위한 자립 생활 지원", bottomText = "주거 공간 제공")
    )
    val homeList = listOf(
        SupportOptionData(topText = "장애학생 주거", bottomText = "10원"),
        SupportOptionData(topText = "장애학생 주거", bottomText = "10원"),
        SupportOptionData(topText = "장애학생 주거", bottomText = "10원"),
        SupportOptionData(topText = "장애학생 주거", bottomText = "10원"),
    )
    val eduList = listOf(
        SupportOptionData(topText = "초등교육 강화", bottomText = "10000만원"),
        SupportOptionData(topText = "초등교육 강화", bottomText = "10000만원"),
        SupportOptionData(topText = "초등교육 강화", bottomText = "10000만원"),
        SupportOptionData(topText = "초등교육 강화", bottomText = "10000만원"),
    )
    val covidList = listOf(
        SupportOptionData(topText = "코로나지원", bottomText = "1원"),
        SupportOptionData(topText = "코로나지원", bottomText = "1원"),
        SupportOptionData(topText = "코로나지원", bottomText = "1원"),
        SupportOptionData(topText = "코로나지원", bottomText = "1원"),
    )
    val medicalList = listOf(
        SupportOptionData(topText = "성형수술비 지원", bottomText = "10000만원"),
        SupportOptionData(topText = "성형수술비 지원", bottomText = "10000만원"),
        SupportOptionData(topText = "성형수술비 지원", bottomText = "10000만원"),
        SupportOptionData(topText = "성형수술비 지원", bottomText = "10000만원"),
    )
    val guitarList = listOf(
        SupportOptionData(topText = "기타지원금 + 피크 지원금", bottomText = "1000원"),
        SupportOptionData(topText = "기타지원금 + 피크 지원금", bottomText = "1000원"),
        SupportOptionData(topText = "기타지원금 + 피크 지원금", bottomText = "1000원"),
        SupportOptionData(topText = "기타지원금 + 피크 지원금", bottomText = "1000원"),
    )
    val selectedList = when (selectedTabIndex.value) {
        0 -> supprotList
        1 -> homeList
        2 -> eduList
        3 -> covidList
        4 -> medicalList
        5 -> guitarList
        else -> emptyList()
    }
    TabRow(
        selectedTabIndex = selectedTabIndex.value,
    ) {
        tabs.forEachIndexed { index, title ->
            Tab(
                selected = selectedTabIndex.value == index,
                onClick = { selectedTabIndex.value = index },
                text = {
                    Text(
                        text = title,
                        style = if (selectedTabIndex.value == index) {
                            TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight(600),
                                color = Color(0xFF2870FB),
                                textAlign = TextAlign.Center,
                            )
                        } else {
                            TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFFCBCCCE),
                                textAlign = TextAlign.Center,
                            )
                        }
                    )
                }
            )
        }
    }
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 12.dp, end = 20.dp, bottom = 12.dp),
    ) {
        selectedList.forEach {
            SupportCard(topText = it.topText, bottomText = it.bottomText)
        }
    }
}


@Composable
fun SupportCard(topText: String, bottomText: String) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(92.dp)
            .background(color = Color(0xFFF8F8F9), shape = RoundedCornerShape(size = 16.dp))
            .padding(start = 20.dp, top = 24.dp, end = 20.dp, bottom = 24.dp),
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .width(278.dp)
                .height(44.dp),
        ) {
            Text(
                text = topText,

                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF171717),
                    textAlign = TextAlign.Center,
                )
            )
            Text(
                text = bottomText,

                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFFB4B5B7),
                )
            )
        }
        Image(
            painter = painterResource(id = R.drawable.favorite),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .padding(0.dp)
                .width(20.dp)
                .height(20.dp),
        )
    }
}
