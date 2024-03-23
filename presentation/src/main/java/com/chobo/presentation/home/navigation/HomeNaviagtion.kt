package com.chobo.presentation.home.navigation

import androidx.compose.foundation.layout.Column
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.chobo.presentation.home.Home
import com.chobo.presentation.home.Support

const val homeRoute = "홈"
const val supportRoute = "지원"


fun NavController.navigateToHome() {
    this.navigate(homeRoute)
}

fun NavGraphBuilder.home(
    navHostController: NavHostController,
) {
    composable(homeRoute) {
        Home(navController = navHostController)
    }
}

fun NavController.navigateToChatSupport() {
    this.navigate(supportRoute)
}

fun NavGraphBuilder.support(
    navHostController :NavHostController
) {
    composable(supportRoute) {
        Column {
            Support(navHostController)
        }
    }
}