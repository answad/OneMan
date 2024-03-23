package com.chobo.oneman.component.BottomNavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.chobo.oneman.component.ChatBotIcon

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val navBackStackEntry = navController.currentBackStackEntryAsState().value
    val currentDestination = navBackStackEntry?.destination?.route
    val selectedItem = BottomNavItemType.fromRoute(currentDestination)

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        ChatBotIcon(navController = navController, modifier = Modifier.offset(y = 15.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            BottomNavigationItem(
                navigationItemType = BottomNavItemType.HOME,
                navController = navController,
                modifier = Modifier.size(24.dp),
                selectedItem = selectedItem
            )
            BottomNavigationItem(
                navigationItemType = BottomNavItemType.HEALTH,
                navController = navController,
                modifier = Modifier.size(24.dp),
                selectedItem = selectedItem
            )
            BottomNavItemChatBot()
            BottomNavigationItem(
                navigationItemType = BottomNavItemType.SUN,
                navController = navController,
                modifier = Modifier.size(24.dp),
                selectedItem = selectedItem
            )
            BottomNavigationItem(
                navigationItemType = BottomNavItemType.PRESON,
                navController = navController,
                modifier = Modifier.size(24.dp),
                selectedItem = selectedItem
            )
        }
    }
}

