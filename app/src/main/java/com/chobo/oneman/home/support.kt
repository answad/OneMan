package com.chobo.oneman.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.chobo.oneman.R
import com.chobo.oneman.component.BottomNavigation.BottomNavigationBar
import com.chobo.oneman.component.TopAppBar
import com.chobo.oneman.home.component.SelectOptionList
import com.chobo.oneman.home.component.SupportMain
import com.chobo.oneman.home.navigation.supportRoute

data class SupportOptionData(
    val topText: String,
    val bottomText: String,
    )

@Composable
fun Support(navHostController: NavHostController) {
    TopAppBar(supportRoute)
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
    BottomNavigationBar(navController = navHostController)
}