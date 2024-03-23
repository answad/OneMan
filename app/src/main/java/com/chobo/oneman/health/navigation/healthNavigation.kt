package com.chobo.oneman.health.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.chobo.oneman.component.TopAppBar
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.chobo.oneman.component.BottomNavigation.BottomNavigationBar


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