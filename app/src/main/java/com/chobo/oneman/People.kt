package com.chobo.oneman


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val myPageRoute = "챗봇"

fun NavController.navigateToMyPage() {
    this.navigate(myPageRoute)
}

fun NavGraphBuilder.myPage(
    paddingValues: PaddingValues
) {
    composable(myPageRoute) {
        Spacer(modifier = Modifier.padding(top = paddingValues.calculateTopPadding()))
        TopAppBar(myPageRoute)
    }
}
