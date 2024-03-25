package com.chobo.oneman


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.rememberNavController
import com.chobo.oneman.ui.theme.OneManTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OneManTheme {
                OneManNavHost(
                    navHostController = rememberNavController(),
                    startDestination = stringResource(id = com.chobo.presentation.R.string.home),
                )
            }
        }
    }
}