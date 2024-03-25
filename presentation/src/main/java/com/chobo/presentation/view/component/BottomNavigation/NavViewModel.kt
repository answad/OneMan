package com.chobo.presentation.view.component.BottomNavigation

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.chobo.presentation.view.chatBot.navigation.navigateToChatBot
import com.chobo.presentation.view.health.navigation.navigateToHealth
import com.chobo.presentation.view.home.navigation.navigateToHome
import com.chobo.presentation.view.myPage.naviagtion.navigateToMyPage
import com.chobo.presentation.view.sun.navigtation.navigateToSun

class NavViewModel : ViewModel() {
    private var currentRoute: BottomNavItemType = BottomNavItemType.HOME

    fun getCurrentRoute(): Enum<BottomNavItemType> {
        return currentRoute
    }

    fun navigateTo(
        navigationItemType: BottomNavItemType,
        navController: NavController
    ) {
        currentRoute = navigationItemType
        when (navigationItemType) {
            BottomNavItemType.HOME -> navController.navigateToHome()
            BottomNavItemType.HEALTH -> navController.navigateToHealth()
            BottomNavItemType.PRESON -> navController.navigateToMyPage()
            BottomNavItemType.SUN -> navController.navigateToSun()
            BottomNavItemType.CHATBOT -> navController.navigateToChatBot()
        }
    }
}