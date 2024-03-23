package com.chobo.oneman

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.chobo.oneman.home.navigation.home
import com.chobo.oneman.home.support


@Composable
fun OneManNavHost(
    navController: NavHostController,
    paddingValues: PaddingValues,
    startDestination: String
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        home(
           navController = navController,
            modifier = Modifier.padding(top = paddingValues.calculateTopPadding())
        )
        health(
            modifier = Modifier.padding(top = paddingValues.calculateTopPadding())
        )
        chatBot(
            modifier = Modifier.padding(top = paddingValues.calculateTopPadding())
        )
        sun(
            modifier = Modifier.padding(top = paddingValues.calculateTopPadding())
        )
        myPage(
            modifier = Modifier.padding(top = paddingValues.calculateTopPadding())
        )
        support(
            modifier = Modifier.padding(top = paddingValues.calculateTopPadding())
        )
    }
}
