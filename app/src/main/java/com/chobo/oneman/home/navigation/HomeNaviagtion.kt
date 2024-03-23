package com.chobo.oneman.home.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.chobo.oneman.component.BottomNavigation.BottomNavigationBar
import com.chobo.oneman.component.TopAppBar
import com.chobo.oneman.home.Home
import com.chobo.oneman.home.Support

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
            TopAppBar(supportRoute)
            Support()
            BottomNavigationBar(navController = navHostController)
        }
    }
}