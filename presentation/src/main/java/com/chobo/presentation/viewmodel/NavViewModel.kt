package com.chobo.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.chobo.presentation.view.chatBot.navigation.navigateToChatBot
import com.chobo.presentation.view.component.BottomNavigation.BottomNavItemType
import com.chobo.presentation.view.health.navigation.navigateToHealth
import com.chobo.presentation.view.home.navigation.navigateToHome
import com.chobo.presentation.view.myPage.naviagtion.navigateToMyPage
import com.chobo.presentation.view.sun.navigtation.navigateToSun

class NavViewModel : ViewModel() {
    private var currentRoute: BottomNavItemType = BottomNavItemType.HOME

    private lateinit var _navController: NavController
    fun getCurrentRoute(): Enum<BottomNavItemType> {
        return currentRoute
    }

    fun SetNavController(navController: NavController){
        _navController = navController
    }
    fun getNavController(): NavController {
        return _navController
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