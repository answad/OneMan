package com.chobo.presentation.view.sun.navigtation

import androidx.compose.foundation.layout.Column
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.chobo.presentation.view.component.BottomNavigation.BottomNavigationBar
import com.chobo.presentation.view.component.BottomNavigation.NavViewModel
import com.chobo.presentation.view.component.TopAppBar

const val SunRoute = "당신의 마음이 항상 빛나길"

fun NavController.navigateToSun() {
    this.navigate(SunRoute)
}

fun NavGraphBuilder.sun(
    navViewModel: NavViewModel
) {
    composable(SunRoute) {
        Column {
            TopAppBar(SunRoute)
            BottomNavigationBar(
                navViewModel = navViewModel
            )
        }
    }
}
