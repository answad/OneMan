package com.chobo.oneman

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.chobo.presentation.view.chatBot.navigation.chatBot
import com.chobo.presentation.view.component.BottomNavigation.NavViewModel
import com.chobo.presentation.view.health.navigation.health
import com.chobo.presentation.view.home.navigation.home
import com.chobo.presentation.view.home.navigation.support
import com.chobo.presentation.view.myPage.naviagtion.myPage
import com.chobo.presentation.view.sun.navigtation.sun


@Composable
fun OneManNavHost(
    navHostController: NavHostController,
    startDestination: String
) {
    val NavViewModel = viewModel<NavViewModel>()
    NavViewModel.SetNavController(navHostController)
    NavHost(
        startDestination = startDestination,
        navController = navHostController
    ) {
        home(
            navViewModel = NavViewModel,
        )
        health(
            navViewModel = NavViewModel
        )
        chatBot(
            navViewModel = NavViewModel
        )
        sun(
            navViewModel = NavViewModel
        )
        myPage(
            navViewModel = NavViewModel
        )
        support(
            navViewModel = NavViewModel
        )
    }
}
