package com.chobo.oneman

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.chobo.presentation.view.chatBot.navigation.chatBot
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
    NavHost(
        navController = navHostController,
        startDestination = startDestination
    ) {
        home(
            navHostController = navHostController,
        )
        health(
            navHostController = navHostController,

            )
        chatBot(
            navHostController = navHostController,
        )
        sun(
            navHostController = navHostController,

            )
        myPage(
            navHostController = navHostController,

            )
        support(
            navHostController = navHostController,


            )
    }
}
