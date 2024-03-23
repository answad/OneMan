package com.chobo.oneman.component.BottomNavigation

enum class BottomNavItemType {
    HOME, HEALTH, CHATBOT, SUN, PRESON;

    companion object {
        fun fromRoute(route: String?): BottomNavItemType {
            return when (route) {
                "홈" -> HOME
                "건강" -> HEALTH
                "챗봇" -> CHATBOT
                "당신의 마음이 항상 빛나길" -> SUN
                "마이 페이지" -> PRESON
                else -> HOME
            }
        }
    }
}