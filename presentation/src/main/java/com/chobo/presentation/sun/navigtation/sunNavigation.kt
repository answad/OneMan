package com.chobo.presentation.sun.navigtation

import androidx.compose.foundation.layout.Column
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.chobo.presentation.component.BottomNavigation.BottomNavigationBar
import com.chobo.presentation.component.TopAppBar

const val SunRoute = "당신의 마음이 항상 빛나길"

fun NavController.navigateToSun() {
    this.navigate(SunRoute)
}

fun NavGraphBuilder.sun(
    navHostController: NavHostController
) {
    composable(SunRoute) {
        Column {
            TopAppBar(SunRoute)
            BottomNavigationBar(navController = navHostController)
        }
    }
}
