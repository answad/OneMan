package com.chobo.oneman.chatBot.navigation

import androidx.compose.foundation.layout.Column
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.chobo.oneman.component.BottomNavigation.BottomNavigationBar
import com.chobo.oneman.component.TopAppBar

const val chatBotRoute = "챗봇"

fun NavController.navigateToChatBot() {
    this.navigate(chatBotRoute)
}

fun NavGraphBuilder.chatBot(
    navHostController : NavHostController,
) {
    composable(chatBotRoute) {
        Column {
            TopAppBar(chatBotRoute)
            BottomNavigationBar(navController = navHostController)
        }
    }
}