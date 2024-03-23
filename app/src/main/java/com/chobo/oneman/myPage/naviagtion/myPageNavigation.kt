package com.chobo.oneman.myPage.naviagtion

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

const val myPageRoute = "마이 페이지"

fun NavController.navigateToMyPage() {
    this.navigate(myPageRoute)
}

fun NavGraphBuilder.myPage(
    navHostController : NavHostController,
    ) {
    composable(myPageRoute) {
        Column {
            TopAppBar(myPageRoute)
            BottomNavigationBar(navController = navHostController)
        }
    }
}
