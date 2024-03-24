package com.chobo.oneman


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.chobo.oneman.ui.theme.OneManTheme
import com.chobo.presentation.view.component.BottomNavigation.NavViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OneManTheme {
                val navViewModel : NavViewModel = viewModel()
                OneManNavHost(
                    navHostController = rememberNavController(),
                    startDestination = stringResource(id = com.chobo.presentation.R.string.home),
                    navViewModel = navViewModel
                )
            }
        }
    }
}