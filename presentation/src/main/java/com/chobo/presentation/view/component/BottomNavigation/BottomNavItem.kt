package com.chobo.presentation.view.component.BottomNavigation

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
import com.chobo.presentation.view.component.HealthIcon
import com.chobo.presentation.view.component.HomeIcon
import com.chobo.presentation.view.component.PersonIcon
import com.chobo.presentation.view.component.SunIcon

@Composable
fun BottomNavigationItem(
    navigationItemType: BottomNavItemType,
    navViewModel: NavViewModel
) {

    val isPressed = navViewModel.getCurrentRoute() == navigationItemType

    val clickableModifier = if (!isPressed) {
        Modifier.clickable {
            navViewModel.navigateTo(navigationItemType, navViewModel.getNavController())
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