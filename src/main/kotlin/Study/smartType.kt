package Study

open class Book(name:String)

class eBook(name: String, var url:String):Book(name)


fun main(args: Array<String>) {
    var aBook:Book = eBook("Kotlin","http://www.hao123.com");
    if (aBook is eBook) {
        println(aBook.url) //如果前面判断过类型，如果为真的情况下面不需要强制类型装好直接就使用智能类型转换了
    }
}