package Study.Chapter3

import javax.sound.midi.Soundbank

//lambda表达式的返回值是最后一行的结果
val lm_sum = {arg1:Int ,arg2:Int ->
    println("$arg1 + $arg2 = ${arg1 + arg2}")
    arg1 + arg2
}
//(Int,Int) ->Int


//如果没有参数 即可省略不写
val printHello = {
    println("hello") //(any?) -> Unit
}
//() -> Unit



fun main(args: Array<String>) { //(Array<String>) -> Unit
    println(lm_sum(54 ,44))
    //lambda表达是和invoke是一样的比如
    println(lm_sum.invoke(54,44))
    printHello()

    //普通遍历数组

    for (str in args) {
        println(str)
    }

    /**
     * Performs the given [action] on each element.
     *
     * public inline fun <T> Array<out T>.forEach(action: (T) -> Unit): Unit {
     *   for (element in this) action(element)
     * }
     */

//  完整写法
    args.forEach ({ element -> println(element) })
//  如果犯法的最后一个参数是lambda表达式、那么表达式可以移到小括号右边
    args.forEach (){ element -> println(element) }
//  那么小括号没有参数传入也可以省略
    args.forEach { element -> println(element)}
//  在forEach的lamuda表达是里面只有一个阐述的情况下可以省略不写
    args.forEach { println(it)} //it 就是element
//  在调用参数为一个的时候还可以简化为
    args.forEach (::println)


    args.forEach ForEach@{ //定义一个标签
        //如果不指定返回的标签，那么这里就会返回main了
//        if (it == "f") {
//            return
//        }
        if (it == "f") return@ForEach

        println(it)
    }

    println("end")


}