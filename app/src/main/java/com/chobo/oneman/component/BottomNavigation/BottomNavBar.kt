package com.chobo.oneman.component.BottomNavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun BottomNavigationBar(navController: NavHostController) {

    var selectedItem: BottomNavItemType by rememberSaveable {
        mutableStateOf(BottomNavItemType.HOME)
    }
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .background(color = Color(0xFFFFFFFF))
            .padding(start = 20.dp, top = 12.dp, end = 20.dp, bottom = 12.dp)
    ) {
        BottomNavigationItem(navigationItemType = BottomNavItemType.HOME, navController = navController, modifier = Modifier.size(24.dp), isPressed = selectedItem == BottomNavItemType.HOME)
        BottomNavigationItem(navigationItemType = BottomNavItemType.HEALTH, navController = navController, modifier = Modifier.size(24.dp), isPressed = selectedItem == BottomNavItemType.HEALTH)
        BottomNavigationItem(navigationItemType = BottomNavItemType.CHATBOT, navController = navController, modifier = Modifier, isPressed = selectedItem == BottomNavItemType.CHATBOT)
        BottomNavigationItem(navigationItemType = BottomNavItemType.SUN, navController = navController, modifier = Modifier.size(24.dp), isPressed = selectedItem == BottomNavItemType.SUN)
        BottomNavigationItem(navigationItemType = BottomNavItemType.PRESON, navController = navController, modifier = Modifier.size(24.dp), isPressed = selectedItem == BottomNavItemType.PRESON)
    }
}
