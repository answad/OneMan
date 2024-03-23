package com.chobo.oneman.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.chobo.oneman.OneManNavHost
import com.chobo.oneman.R


data class BottomNavigationItem(
    val title: String,
    val selectedIcon: Int,
    val unselectedIcon: Int,
)

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val Items = listOf(
        BottomNavigationItem(
            "홈",
            R.drawable.home_selected,
            R.drawable.home_notselected
        ),
        BottomNavigationItem(
            "건강",
            R.drawable.health_selected,
            R.drawable.health_notselected
        ),
        BottomNavigationItem(
            "챗봇",
            R.drawable.chatbot,
            R.drawable.chatbot
        ),
        BottomNavigationItem(
            "마음",
            R.drawable.sun_selected,
            R.drawable.sun_notselected
        ),
        BottomNavigationItem(
            "마이페이지",
            R.drawable.peason_selected,
            R.drawable.person_notselected
        ),
    )
    var selectedItemIndex: Int by rememberSaveable {
        mutableIntStateOf(0)
    }
    Scaffold(
        modifier = Modifier
            .fillMaxWidth()
            .height(66.dp),
        bottomBar = {
            NavigationBar {
                Items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        label = {
                            Text(
                                text = item.title,
                                modifier = Modifier.padding()
                            )
                        },
                        selected = selectedItemIndex == index,
                        onClick = {
                            selectedItemIndex = index
                            navController.navigate(item.title)
                        },
                        icon = {
                            Image(
                                painter = painterResource(
                                    id = if (index == selectedItemIndex) {
                                        item.selectedIcon
                                    } else {
                                        item.unselectedIcon
                                    }
                                ),
                                contentDescription = item.title,
                            )
                        },
                    )
                }
            }
        }
    ) { paddingValues ->
        OneManNavHost(
            navController = navController,
            paddingValues = paddingValues,
            startDestination = stringResource(id = R.string.home)
        )
    }
}
