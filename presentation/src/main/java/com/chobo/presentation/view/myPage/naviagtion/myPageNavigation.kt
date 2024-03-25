package com.chobo.presentation.view.myPage.naviagtion

import androidx.compose.foundation.layout.Column
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.chobo.presentation.view.component.BottomNavigation.BottomNavigationBar
import com.chobo.presentation.view.component.BottomNavigation.NavViewModel
import com.chobo.presentation.view.component.TopAppBar

const val myPageRoute = "마이 페이지"

fun NavController.navigateToMyPage() {
    this.navigate(myPageRoute)
}

fun NavGraphBuilder.myPage(
    navViewModel: NavViewModel,
) {
    composable(myPageRoute) {
        Column {
            TopAppBar(myPageRoute)
            BottomNavigationBar(
                navViewModel = navViewModel
            )
        }
    }
}
