package com.chobo.presentation.view.component.BottomNavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.chobo.presentation.view.component.ChatBotIcon
import com.chobo.presentation.viewmodel.NavViewModel

@Composable
fun BottomNavigationBar(navViewModel: NavViewModel) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        ChatBotIcon(modifier = Modifier.offset(y = 15.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            BottomNavigationItem(
                navigationItemType = BottomNavItemType.HOME,
                navViewModel = navViewModel
            )
            BottomNavigationItem(
                navigationItemType = BottomNavItemType.HEALTH,
                navViewModel = navViewModel
            )
            BottomNavItemChatBot(
                navViewModel = navViewModel
            )
            BottomNavigationItem(
                navigationItemType = BottomNavItemType.SUN,
                navViewModel = navViewModel
            )
            BottomNavigationItem(
                navigationItemType = BottomNavItemType.PRESON,
                navViewModel = navViewModel
            )
        }
    }
}

