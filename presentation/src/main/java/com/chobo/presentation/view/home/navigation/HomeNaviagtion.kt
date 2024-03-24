package com.chobo.presentation.view.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.chobo.presentation.view.component.BottomNavigation.NavViewModel
import com.chobo.presentation.view.home.Home
import com.chobo.presentation.view.home.Support

const val homeRoute = "홈"
const val supportRoute = "지원"


fun NavController.navigateToHome() {
    this.navigate(homeRoute)
}

fun NavGraphBuilder.home(
    navHostController: NavHostController,
    navViewModel: NavViewModel,
) {
    composable(homeRoute) {
        Home(
            navController = navHostController,
            navViewModel = navViewModel
        )
    }
}

fun NavController.navigateToChatSupport() {
    this.navigate(supportRoute)
}

fun NavGraphBuilder.support(
    navHostController: NavHostController,
    navViewModel: NavViewModel
) {
    composable(supportRoute) {
        Support(
            navHostController = navHostController,
            navViewModel = navViewModel
        )
    }
}