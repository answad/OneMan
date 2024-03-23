package com.chobo.oneman.component.BottomNavigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.navigation.NavController
import com.chobo.oneman.chatBot.navigation.navigateToChatBot
import com.chobo.oneman.component.ChatBotIcon
import com.chobo.oneman.component.HealthIcon
import com.chobo.oneman.component.HomeIcon
import com.chobo.oneman.component.PersonIcon
import com.chobo.oneman.component.SunIcon
import com.chobo.oneman.health.navigation.navigateToHealth
import com.chobo.oneman.home.navigation.navigateToHome
import com.chobo.oneman.myPage.naviagtion.navigateToMyPage
import com.chobo.oneman.sun.navigtation.navigateToSun

@Composable
fun BottomNavigationItem(
    navigationItemType: BottomNavItemType,
    navController: NavController,
    modifier: Modifier,
    isPressed: Boolean
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(78.dp)
            .height(42.dp)
            .clickable {
                when (navigationItemType) {
                    BottomNavItemType.HOME -> navController.navigateToHome()
                    BottomNavItemType.HEALTH -> navController.navigateToHealth()
                    BottomNavItemType.CHATBOT -> navController.navigateToChatBot()
                    BottomNavItemType.PRESON -> navController.navigateToMyPage()
                    BottomNavItemType.SUN -> navController.navigateToSun()
                }
            }
    ) {
        when (navigationItemType) {
            BottomNavItemType.HOME -> HomeIcon(modifier, isPressed)
            BottomNavItemType.HEALTH -> HealthIcon(modifier, isPressed)
            BottomNavItemType.CHATBOT -> ChatBotIcon(modifier, isPressed)
            BottomNavItemType.PRESON -> PersonIcon(modifier, isPressed)
            BottomNavItemType.SUN -> SunIcon(modifier, isPressed)
        }
        Text(
            text = when (navigationItemType) {
                BottomNavItemType.HOME -> "홈"
                BottomNavItemType.HEALTH -> "건강"
                BottomNavItemType.CHATBOT -> "챗봇"
                BottomNavItemType.PRESON -> "챗봇"
                BottomNavItemType.SUN -> "마이페이지"
            },

            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF171717),
                textAlign = TextAlign.Center,
            )
        )

    }
}