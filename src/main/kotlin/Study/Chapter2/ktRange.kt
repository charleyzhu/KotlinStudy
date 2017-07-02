package Study.Chapter2

val range:IntRange = 0..100 //[0,1024]
val range_exclusive:IntRange = 0 until 1024 //[0,1024）[0,1023]

val emptyRange: IntRange = 0..-1 //空的区间？


//其实区间这种形式在swift中也有
fun main(args: Array<String>) {
    println(emptyRange.isEmpty())
    println(range.contains(50))//是否包含
    println(50 in range)

    for (i in range) {
        println(i)
    }

}