package com.chobo.presentation.view.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.chobo.presentation.viewmodel.NavViewModel
import com.chobo.presentation.view.home.Home
import com.chobo.presentation.view.home.Support
import kotlin.reflect.KFunction0

const val homeRoute = "홈"
const val supportRoute = "지원"


fun NavController.navigateToHome() {
    this.navigate(homeRoute)
}

fun NavGraphBuilder.home(navigateToHome: KFunction0<Unit>) {
    composable(homeRoute) {
        Home(
            navigateToHome = navigateToHome
        )
    }
}

fun NavController.navigateToChatSupport() {
    this.navigate(supportRoute)
}

fun NavGraphBuilder.support(
) {
    composable(supportRoute) {
        Support(
        )
    }
}