package Study

//正常返回
fun GetUserName():String {
    return "charley"
}

//直接返回null会报错 在kotlin中有每个类型都有一个可空类型比如String?
//fun GetPassword():String{
//    return null
//}

//如果返回值可能需要返回null那返回值就应该为可空类型？
fun GetPassword():String? {
    return null
}

fun main(args: Array<String>) {
    val userName:String = GetUserName()
    println(userName)
    val passwd:String? = GetPassword()
    println(passwd)
    var charleyPasswd:String? = "123456"
    println(charleyPasswd!!.length)//!!表示强制确认这个charleyPasswd这个变量不会是null

    val ddPasswod = GetPassword()?: return //这里和oc里面的写法很相似
    println(ddPasswod)

}