package org.mqmdz.marcoskmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform