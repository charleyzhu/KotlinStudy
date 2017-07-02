package Study

var string:String = "HelloWorld"
val arrChar:String = String(charArrayOf('a','b','c','d'))

fun main(args: Array<String>) {
    println(string)
    println(arrChar)

    println(string == arrChar)
    println(string === arrChar)
    val copyString = string
    println(string === copyString)//是否是同一个对象
    //字符串模板

    println("用字符串模板say:$string")

    val aInt:Int = 4
    val bInt:Int = 5
    println("$aInt + $bInt = ${aInt + bInt}")

    //转义符 双引号
//    比如输出 hello "Trump"
    println("Hello \"Trumo\"")
    //转义符 $
    println("hello $arrChar and hellp\$arrChar")

    ///原始字符串
    val rawString = """
    🙃
    呵呵
    哈哈
    $string
    /$string
    $ string
    """
    println(rawString)
}