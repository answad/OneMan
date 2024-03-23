package com.chobo.oneman.myPage.naviagtion

import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.chobo.oneman.component.TopAppBar

const val myPageRoute = "마이 페이지"

fun NavController.navigateToMyPage() {
    this.navigate(myPageRoute)
}

fun NavGraphBuilder.myPage(
    modifier: Modifier) {
    composable(myPageRoute) {
        Spacer(modifier)
        TopAppBar(myPageRoute)
    }
}
