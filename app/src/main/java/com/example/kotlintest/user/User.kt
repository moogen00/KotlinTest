package com.example.kotlintest.user

class User(val nickname: String) {
    val name: String
    init {
        println("init")
        if (nickname.isEmpty()) {
            throw IllegalArgumentException("Error")
        }
        this.name = nickname
        println("this.name = ${this.name}")
    }
}