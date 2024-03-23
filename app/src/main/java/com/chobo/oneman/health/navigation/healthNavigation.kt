package com.chobo.oneman.health.navigation

import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.chobo.oneman.component.TopAppBar


const val Health = "건강"

fun NavController.navigateToHealth() {
    this.navigate(Health)
}

fun NavGraphBuilder.health(
    modifier: Modifier
) {
    composable(Health) {
        Spacer(modifier)
        TopAppBar(Health)
    }
}