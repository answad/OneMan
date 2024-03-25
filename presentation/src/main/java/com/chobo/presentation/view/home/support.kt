package com.chobo.presentation.view.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.chobo.presentation.view.component.BottomNavigation.BottomNavigationBar
import com.chobo.presentation.viewmodel.NavViewModel
import com.chobo.presentation.view.component.TopAppBar
import com.chobo.presentation.view.home.component.SelectOptionList
import com.chobo.presentation.view.home.component.SupportMain
import com.chobo.presentation.view.home.navigation.supportRoute

@Composable
fun Support(navViewModel: NavViewModel) {
    TopAppBar(supportRoute)
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(top = 48.dp)
    ) {
        SupportMain()
        SelectOptionList()
    }
    BottomNavigationBar(
        navViewModel = navViewModel
    )
}