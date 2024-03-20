package com.chobo.oneman

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val chatBotRoute = "챗봇"

fun NavController.navigateToChatBot() {
    this.navigate(chatBotRoute)
}

fun NavGraphBuilder.chatBot(
    paddingValues: PaddingValues
) {
    composable(chatBotRoute) {
        Spacer(modifier = Modifier.padding(top = paddingValues.calculateTopPadding()))
        TopAppBar(chatBotRoute)
    }
}
