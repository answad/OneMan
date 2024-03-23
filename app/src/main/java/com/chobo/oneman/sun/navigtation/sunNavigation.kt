package com.chobo.oneman.sun.navigtation

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
import com.chobo.oneman.health.navigation.Health

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
