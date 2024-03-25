package com.chobo.presentation.view.component.BottomNavigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BottomNavItemChatBot(
    navViewModel: NavViewModel
) {
    val isPressed = navViewModel.getCurrentRoute() == BottomNavItemType.CHATBOT
    val modifier = if (isPressed) Modifier
        .width(78.dp)
        .height(42.dp)
    else Modifier
        .width(78.dp)
        .height(42.dp)
        .clickable {
            navViewModel.navigateTo(BottomNavItemType.CHATBOT, navViewModel.getNavController())
        }
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Spacer(
            modifier = Modifier
                .width(24.dp)
                .height(24.dp)
        )
        Text(
            text = "챗봇",
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF171717),
                textAlign = TextAlign.Center,
            )
        )
    }
}