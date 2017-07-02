package Study.Chapter2

//kotlin的Array

val arrayOfInt:IntArray = intArrayOf(1,2,3,4)
val arrayOfChar:CharArray = charArrayOf('a','b','c','c')

//kotlin的array没有泛型?有的

val arrayOfString:Array<String> = arrayOf("我的","Kotlin")
val arrayofUser:Array<User> = arrayOf(User("djcash"), User("charley"))

fun main(args: Array<String>) {
    println(arrayOfInt.size)//数组成员数

    for (i in arrayOfInt) { //遍历数组
        println(i)
    }

    for (obj in arrayofUser) {
        println(obj)
    }

    println(arrayOfString[1]) //下标访问

    println(arrayOfString.joinToString("")) //可以看做数组转字符串
    println(arrayOfChar.slice(1..3)) //转换我切片
}

