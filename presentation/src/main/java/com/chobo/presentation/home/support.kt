package com.chobo.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.chobo.presentation.home.component.SelectOptionList
import com.chobo.presentation.home.component.SupportMain
import com.chobo.presentation.home.navigation.supportRoute

data class SupportOptionData(
    val topText: String,
    val bottomText: String,
    )

@Composable
fun Support(navHostController: NavHostController) {
    com.chobo.presentation.component.TopAppBar(supportRoute)
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 48.dp)
    ) {
        SupportMain()
        SelectOptionList()
    }
    com.chobo.presentation.component.BottomNavigation.BottomNavigationBar(navController = navHostController)
}