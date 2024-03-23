package com.chobo.oneman.chatBot.navigation

import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.chobo.oneman.component.TopAppBar

const val chatBotRoute = "챗봇"

fun NavController.navigateToChatBot() {
    this.navigate(chatBotRoute)
}

fun NavGraphBuilder.chatBot(
    modifier: Modifier
) {
    composable(chatBotRoute) {
        Spacer(modifier)
        TopAppBar(chatBotRoute)
    }
}