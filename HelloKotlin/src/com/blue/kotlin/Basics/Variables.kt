package com.blue.kotlin.Basics

fun main(args: Array<String>) {
    val foo = "Hello"
    // foo = "World"//Show error: Val cannot be reassigned

    var boo = "Hello"
    boo = "World"
    println(boo)
}