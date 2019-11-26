package com.blue.kotlin.Basics

fun main(args: Array<String>) {
    /* 和Java类似的运算符
    +, -, *, /, %
    +=, -=, *=,/=, %=
    &&, ||, !
    =,<, >, <=, >=

    和Java不同的运算符
    ==, !=  比较值,可用于任意类型
    ===,!=== 比较地址
    [] 索引访问
*/

    var a = "Hello"
    var b = "Hello"
    if (a == b) { // this evaluates to true
        println("$a is equal to $b")
    }

    var p1 = Person("John")
    var p2 = Person("John")
    if (p1 === p2) { // false
        println("p1 === p2")
    } else if (p1 == p2) {
        println("p1!=== p2 but p1 == p2")
    }else{
        println("p1 != p2")
    }

    val fruits = listOf("Apple", "Banana", "Orange")
    println(fruits.get(2)) // Orange
    println(fruits[2]) // Orange
}

class Person(val name: String) {
}
