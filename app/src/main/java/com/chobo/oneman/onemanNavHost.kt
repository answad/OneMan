package com.chobo.oneman

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost


@Composable
fun oneManNavHost(
    navController: NavHostController,
    paddingValues: PaddingValues,
    startDestination: String
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        home(navController, paddingValues)
        health(paddingValues)
        chatBot(paddingValues)
        sun(paddingValues)
        myPage(paddingValues)
        support(paddingValues)
    }
}
