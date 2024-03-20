package com.chobo.oneman

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val SunRoute = "챗봇"

fun NavController.navigateToSun() {
    this.navigate(SunRoute)
}

fun NavGraphBuilder.sun(
    paddingValues: PaddingValues
) {
    composable(SunRoute) {
        Spacer(modifier = Modifier.padding(top = paddingValues.calculateTopPadding()))
        TopAppBar(SunRoute)
    }
}
