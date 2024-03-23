package com.chobo.oneman.home.navigation

import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.chobo.oneman.component.TopAppBar
import com.chobo.oneman.home.Home
import com.chobo.oneman.home.Support

const val mainRoute = "홈"
const val supportRoute = "지원"


fun NavController.navigateToHome() {
    this.navigate(mainRoute)
}

fun NavGraphBuilder.home(
    navController: NavHostController,
    modifier: Modifier
) {
    composable(mainRoute) {
        Spacer(modifier)
        TopAppBar(mainRoute)
        Home(navController = navController)
    }
}

fun NavController.navigateToChatSupport() {
    this.navigate(supportRoute)
}

fun NavGraphBuilder.support(
    modifier: Modifier
) {
    composable(supportRoute) {
        Spacer(modifier)
        TopAppBar(supportRoute)
        Support()
    }
}