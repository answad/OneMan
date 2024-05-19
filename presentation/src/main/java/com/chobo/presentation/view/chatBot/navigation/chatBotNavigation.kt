package com.chobo.presentation.view.chatBot.navigation

import androidx.compose.foundation.layout.Column
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.chobo.presentation.view.component.BottomNavigation.BottomNavigationBar
import com.chobo.presentation.viewmodel.NavViewModel
import com.chobo.presentation.view.component.TopAppBar

const val chatBotRoute = "챗봇"

fun NavController.navigateToChatBot() {
    this.navigate(chatBotRoute)
}

fun NavGraphBuilder.chatBot(
) {
    composable(chatBotRoute) {
        Column {
            TopAppBar(chatBotRoute)
        }
    }
}