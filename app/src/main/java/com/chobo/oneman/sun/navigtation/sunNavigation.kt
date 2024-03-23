package com.chobo.oneman.sun.navigtation

import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.chobo.oneman.component.TopAppBar

const val SunRoute = "단신의 마음이 항상 빛나길"

fun NavController.navigateToSun() {
    this.navigate(SunRoute)
}

fun NavGraphBuilder.sun(
    modifier: Modifier
) {
    composable(SunRoute) {
        Spacer(modifier)
        TopAppBar(SunRoute)
    }
}
