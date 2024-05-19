package com.chobo.presentation.view.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.chobo.presentation.view.component.TopAppBar
import com.chobo.presentation.view.home.component.HomeMain
import com.chobo.presentation.view.home.navigation.homeRoute
import kotlin.reflect.KFunction0

@Composable
fun Home(navigateToHome: KFunction0<Unit>) {
    TopAppBar(homeRoute)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 48.dp)
    ) {
        HomeMain(navigateToHome = navigateToHome)
    }
}