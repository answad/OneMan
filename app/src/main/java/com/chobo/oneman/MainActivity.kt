package com.chobo.oneman


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chobo.oneman.ui.theme.OneManTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OneManTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    OnManApp()
                }
            }
        }
    }
}

@Composable
fun OnManApp() {
    BottomNavigation()
}

data class BottomNavigationItem(
    val title: String,
    val selectedIcon: Int,
    val unselectedIcon: Int,
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomNavigation() {
    val navController = rememberNavController()
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
        Navigation(
            navController = navController,
            paddingValues
        )
    }
}

@Composable
fun Navigation(navController: NavHostController, paddingValues: PaddingValues) {
    NavHost(navController = navController, startDestination = "홈") {
        composable("홈") {
            Spacer(modifier = Modifier.padding(top = paddingValues.calculateTopPadding()))
            TopAppBar("홈")
            Home(navController = navController)
        }
        composable("건강") {
            Spacer(modifier = Modifier.padding(top = paddingValues.calculateTopPadding()))
            TopAppBar("건강")
        }
        composable("챗봇") {
            Spacer(modifier = Modifier.padding(top = paddingValues.calculateTopPadding()))
            TopAppBar("챗봇")
        }
        composable("마음") {
            Spacer(modifier = Modifier.padding(top = paddingValues.calculateTopPadding()))
            TopAppBar("당신의 마음이 항상 빛나길")
        }
        composable("마이페이지") {
            Spacer(modifier = Modifier.padding(top = paddingValues.calculateTopPadding()))
            TopAppBar("마이 페이지")
        }
        composable("지원") {
            Spacer(modifier = Modifier.padding(top = paddingValues.calculateTopPadding()))
            TopAppBar("지원")
            Support()
        }
    }
}

@Composable
fun TopAppBar(text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .background(color = Color(0xFFFFFFFF))
            .padding(start = 20.dp, top = 12.dp, end = 20.dp, bottom = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF171717),
                textAlign = TextAlign.Center,
            )
        )
        Image(
            modifier = Modifier
                .size(24.dp),
            painter = painterResource(id = R.drawable.bell),
            contentDescription = "종"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OneManTheme {
        OnManApp()
    }
}