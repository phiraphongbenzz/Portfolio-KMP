package com.alpha.apps.portfolio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform