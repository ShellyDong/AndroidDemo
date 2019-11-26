package com.blue.kotlin.Basics

fun main (args: Array<String>){
    val intLiteral = 5
    println("The type of intLiteral is " + intLiteral.javaClass.name)

    val doubleLiteral = .02
    println("The type of doubleLiteral is " + doubleLiteral.javaClass.name)

    val stringLiteral = "Hello"
    println("The type of stringLiteral is " + stringLiteral.javaClass.name)

    val charLiteral = '1'
    println("The type of charLiteral is " + charLiteral.javaClass.name)

    val boolLiteral = true
    println("The type of boolLiteral is " + boolLiteral.javaClass.name)
}