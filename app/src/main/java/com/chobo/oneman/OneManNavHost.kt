package com.chobo.oneman

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.chobo.oneman.chatBot.navigation.chatBot
import com.chobo.oneman.health.navigation.health
import com.chobo.oneman.home.navigation.home
import com.chobo.oneman.home.navigation.support
import com.chobo.oneman.myPage.naviagtion.myPage
import com.chobo.oneman.sun.navigtation.sun


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
