package Study

import FastKotlin.day1.tkUser as day1User
import FastKotlin.day2.tkUser as day2User
import FastKotlin.day3.tkUser as day3User

fun main(args: Array<String>) {
    //包，相当于c#中的命名空间
    val d1User:day1User = day1User()
    val d2User:day2User = day2User()
    val d3User:day3User = day3User()

    println(d1User)
    println(d2User)
    println(d3User)
}