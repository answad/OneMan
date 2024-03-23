package com.chobo.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.chobo.presentation.home.component.HomeMain
import com.chobo.presentation.home.navigation.homeRoute

@Composable
fun Home(navController: NavHostController) {
    com.chobo.presentation.component.TopAppBar(homeRoute)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 48.dp)
    ) {
        HomeMain(navController = navController)
        com.chobo.presentation.component.BottomNavigation.BottomNavigationBar(navController)
    }
}