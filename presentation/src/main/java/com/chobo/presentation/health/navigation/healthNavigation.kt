package com.chobo.presentation.health.navigation

import androidx.compose.foundation.layout.Column
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.chobo.presentation.component.BottomNavigation.BottomNavigationBar
import com.chobo.presentation.component.TopAppBar


const val Health = "건강"

fun NavController.navigateToHealth() {
    this.navigate(Health)
}

fun NavGraphBuilder.health(
    navHostController : NavHostController
) {
    composable(Health) {
        Column {
            TopAppBar(Health)
            BottomNavigationBar(navController = navHostController)
        }
    }
}