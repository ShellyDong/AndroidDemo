package com.blue.kotlin.Basics

fun main(args: Array<String>) {
/*数字类型长度
            Double  64
            Float   32
            Long    64
            Int     32
            Short   16
            Byte    8
 */
    //数字
    introNumbers()

    //字符
    introChars('1')

    //布尔型
    var count = 0
    //if (count) println("zero")  报错，数字0/1不是布尔型
    // if ("") println("empty")  报错，必须是true/false才是布尔型

    //数组
    introArrays()

    //字符串
    introStrings()
}

private fun introStrings() {
    var str: String = "Hello World\n"
    println(str)

    var multipleLineStr = """春晓
            春眠不觉晓
            处处闻啼鸟
            夜来风雨声
            花落知多少
"""
    println(multipleLineStr)

    str = "Hello world with kotlin."
    for (i in str) println(i)
    println(str[2]) // returns 'l'

    // var strNum = 10 + "" 报错
    var strNum = 10.toString() // 必须显示转换
    println(strNum)

    var name = "Hello Kotlin"
    var email = "hello.kotlin@gmail.com"
    var phone = "(086)111-1111-1111"
    // var concat = String.format("name: %s | email: %s | phone: %s", name, email, phone)  在Java里面经常这样用，但Kotlin更推荐下面的写法
    var concat = "name: $name | email: $email | phone: $phone"
    println(concat)


    println("Hello $name")
    println("The name '$name' is ${name.length} characters long")
    println("Hello ${foo()}")
}

fun foo(): String {
    return "Fool"
}

fun introNumbers() {
    //不同数字类型无法直接赋值
    var a = 10L // a is a Long literal, note the L postfix
    var b = 20
    //a = b // 不同类型，赋值报错
    a = b.toLong() // this will work
    println(a.toString() + " and the type is " + a.javaClass.name)

    //使用_增加数字可读性
    var oneMillion = 1_000_000
    var creditCardNumber = 1234_5678_9012_3456

    //浮点数
    val e = 2.12345678901234567890 // Double
    val eFloat = 2.1234567890123f // Float
    println(e.toString() + " and the type is " + e.javaClass.name)
    println(eFloat.toString() + " and the type is " + eFloat.javaClass.name)
}

fun introArrays() {
    var emptyArray = arrayOfNulls<String>(2)
    emptyArray[0] = "Hello"
    //emptyArray[1] = 2 报错，类型不兼容
    emptyArray[1] = "World"
    for (i in emptyArray.indices) println(emptyArray[i])
    for (i in emptyArray) println(i)
    var arrayOfInts = arrayOf(1, 2, 3, 4, 5, 6)
    arrayOfInts.forEach { e -> println(e) }
    var arrayWords = "hello world with kotlin".split(" ").toTypedArray()
    arrayWords.forEach { item -> println(item) }
}

fun introChars(keyCode: Char) {
    // if (keyCode == 97) {  }   报错， Kotlin中字符与数字类型不兼容
    println(keyCode)
    println('\\') //转义字符\t、 \b、\n、\r、\'、\"、\\、\$
    println('\uFF23')//Unicode字符

    val a = 'a'
    println(a.isLowerCase()) // true
    println(a.isDigit()) // false
    println(a.toUpperCase()) // A
    val b: String = a.toString() // converts it to a String
}