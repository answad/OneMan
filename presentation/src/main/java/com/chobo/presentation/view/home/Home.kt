package com.chobo.presentation.view.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.chobo.presentation.view.component.BottomNavigation.BottomNavigationBar
import com.chobo.presentation.view.component.BottomNavigation.NavViewModel
import com.chobo.presentation.view.component.TopAppBar
import com.chobo.presentation.view.home.component.HomeMain
import com.chobo.presentation.view.home.navigation.homeRoute

@Composable
fun Home(navViewModel: NavViewModel) {
    TopAppBar(homeRoute)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 48.dp)
    ) {
        HomeMain(navController = navViewModel.getNavController())
        BottomNavigationBar(navViewModel = navViewModel)
    }
}