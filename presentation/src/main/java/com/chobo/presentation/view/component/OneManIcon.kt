package com.chobo.presentation.view.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.chobo.presentation.R

@Composable
fun HomeIcon(
    modifier: Modifier = Modifier,
    isPressed: Boolean = false,
) {
    Image(
        modifier = modifier,
        painter = painterResource(
            id = if (isPressed) R.drawable.ic_pressed_home
            else R.drawable.ic_home
        ),
        contentDescription = "홈 아이콘"
    )
}

@Composable
fun HealthIcon(
    modifier: Modifier = Modifier,
    isPressed: Boolean = false,
) {
    Image(
        modifier = modifier,
        painter = painterResource(
            id = if (isPressed) R.drawable.ic_pressed_health
            else R.drawable.ic_health
        ),
        contentDescription = "건강 아이콘"
    )
}

@Composable
fun SunIcon(
    modifier: Modifier = Modifier,
    isPressed: Boolean = false,
) {
    Image(
        modifier = modifier,
        painter = painterResource(
            id = if (isPressed) R.drawable.ic_pressed_sun
            else R.drawable.ic_sun
        ),
        contentDescription = "마음 아이콘"
    )
}

@Composable
fun PersonIcon(
    modifier: Modifier = Modifier,
    isPressed: Boolean = false,
) {
    Image(
        modifier = modifier,
        painter = painterResource(
            id = if (isPressed) R.drawable.ic_pressed_person
            else R.drawable.ic_person
        ),
        contentDescription = "홈 아이콘"
    )
}

@Composable
fun ChatBotIcon(
    modifier: Modifier = Modifier,
    isPressed: Boolean = false,
) {
    Image(
        modifier = if (isPressed) modifier.size(54.dp).offset(y = (-34).dp)
        else modifier.size(48.dp).offset(y = (-34).dp),
        painter = painterResource(
            id = R.drawable.ic_chatbot
        ),
        contentDescription = "챗봇 아이콘"
    )
}