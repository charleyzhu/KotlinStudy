package Study.Chapter3

fun Sum(arg1:Int, arg2:Int):Int {
    return arg1 + arg2
}

fun sum(arg1:Int, arg2:Int) = arg1 + arg2 //简写

val addFUnc = fun (num1:Int ,num2:Int) = num1 + num2

fun main(args: Array<String>) {
    val num = 5;
    val num2 = 14
    println("$num + $num2 = ${Sum(num,num2)}")
    println("$num + $num2 = ${addFUnc(num,num2)}")
}