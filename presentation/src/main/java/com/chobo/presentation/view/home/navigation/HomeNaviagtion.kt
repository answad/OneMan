package com.chobo.presentation.view.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.chobo.presentation.viewmodel.NavViewModel
import com.chobo.presentation.view.home.Home
import com.chobo.presentation.view.home.Support

const val homeRoute = "홈"
const val supportRoute = "지원"


fun NavController.navigateToHome() {
    this.navigate(homeRoute)
}

fun NavGraphBuilder.home(
    navViewModel: NavViewModel,
) {
    composable(homeRoute) {
        Home(
            navViewModel = navViewModel
        )
    }
}

fun NavController.navigateToChatSupport() {
    this.navigate(supportRoute)
}

fun NavGraphBuilder.support(
    navViewModel: NavViewModel
) {
    composable(supportRoute) {
        Support(
            navViewModel = navViewModel
        )
    }
}