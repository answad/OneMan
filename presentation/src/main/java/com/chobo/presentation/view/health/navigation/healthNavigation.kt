package com.chobo.presentation.view.health.navigation

import androidx.compose.foundation.layout.Column
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.chobo.presentation.view.component.BottomNavigation.BottomNavigationBar
import com.chobo.presentation.viewmodel.NavViewModel
import com.chobo.presentation.view.component.TopAppBar


const val Health = "건강"

fun NavController.navigateToHealth() {
    this.navigate(Health)
}

fun NavGraphBuilder.health(
    navigateToHealth: () -> Unit
) {
    composable(Health) {
        Column {
            TopAppBar(Health)

        }
    }
}