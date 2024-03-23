package com.chobo.oneman.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.chobo.oneman.R
import com.chobo.oneman.chatBot.navigation.navigateToChatBot
import com.chobo.oneman.component.BottomNavigation.BottomNavigationBar
import com.chobo.oneman.component.TopAppBar
import com.chobo.oneman.health.navigation.navigateToHealth
import com.chobo.oneman.home.component.HomeMain
import com.chobo.oneman.home.component.HomeServiceCard
import com.chobo.oneman.home.component.NearbyEcoFriendlyMart
import com.chobo.oneman.home.navigation.homeRoute
import com.chobo.oneman.home.navigation.navigateToChatSupport

@Composable
fun Home(navController: NavHostController) {
    TopAppBar(homeRoute)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 48.dp)
    ) {
        HomeMain(navController = navController)
        BottomNavigationBar(navController)
    }
}