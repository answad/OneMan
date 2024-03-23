package com.chobo.oneman.component.BottomNavigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
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
    selectedItem: BottomNavItemType
) {
    val isPressed = navigationItemType == selectedItem
    val clickableModifier = if (!isPressed) {
        Modifier.clickable {
            when (navigationItemType) {
                BottomNavItemType.HOME -> navController.navigateToHome()
                BottomNavItemType.HEALTH -> navController.navigateToHealth()
                BottomNavItemType.PRESON -> navController.navigateToMyPage()
                BottomNavItemType.SUN -> navController.navigateToSun()
                BottomNavItemType.CHATBOT -> TODO()
            }
        }
    } else {
        Modifier
    }
    val modifier = Modifier
        .width(78.dp)
        .height(42.dp)
        .then(clickableModifier)
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        when (navigationItemType) {
            BottomNavItemType.HOME -> HomeIcon(Modifier.size(24.dp), isPressed)
            BottomNavItemType.HEALTH -> HealthIcon(Modifier.size(24.dp), isPressed)
            BottomNavItemType.PRESON -> PersonIcon(Modifier.size(24.dp), isPressed)
            BottomNavItemType.SUN -> SunIcon(Modifier.size(24.dp), isPressed)
            BottomNavItemType.CHATBOT -> TODO()
        }
        Text(
            text = when (navigationItemType) {
                BottomNavItemType.HOME -> "홈"
                BottomNavItemType.HEALTH -> "건강"
                BottomNavItemType.PRESON -> "마이페이지"
                BottomNavItemType.SUN -> "마음"
                BottomNavItemType.CHATBOT -> TODO()
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