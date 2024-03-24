package com.chobo.presentation.view.component.BottomNavigation

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.chobo.presentation.view.chatBot.navigation.navigateToChatBot
import com.chobo.presentation.view.health.navigation.navigateToHealth
import com.chobo.presentation.view.home.navigation.navigateToHome
import com.chobo.presentation.view.myPage.naviagtion.navigateToMyPage
import com.chobo.presentation.view.sun.navigtation.navigateToSun

class NavViewModel : ViewModel() {
    val currentRoute = BottomNavItemType.HOME

    fun navigateTo(navigationItemType: BottomNavItemType, navController: NavController) {
        when (navigationItemType) {
            BottomNavItemType.HOME -> navController.navigateToHome()
            BottomNavItemType.HEALTH -> navController.navigateToHealth()
            BottomNavItemType.PRESON -> navController.navigateToMyPage()
            BottomNavItemType.SUN -> navController.navigateToSun()
            BottomNavItemType.CHATBOT -> navController.navigateToChatBot()
        }
    }
}