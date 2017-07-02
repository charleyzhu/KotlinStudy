package Study.Chapter2

class AClass(var name:String) {

}

//没有类成员属性或者方法可以简写为
class ShorthandUser (var name:String)

//如果类只有一个构造方法的话可以省略constructor方法，有多个构造函数的话就必须使用constructor方法了

class Person (var name:String) {
    constructor(name: String,passwd:String):this(name)
}

//类的初始化方法init

class PersonInit(var name:String)  {
    init {
        //类实例化的时候会执行init代码块的代码，用于初始化类
    }
}


//如果希望类可以被继承需要使用open关键字修饰

open class OpenUser(var name:String)

//综合应用
open class User (var name:String)
{
    constructor(name:String, password:String):this(name)
    init {
        println("Class ${this.javaClass.simpleName} Instantiated object")
    }
    open fun say(msg:Any){ //可以被重写的方法也需要加上open关键字
        println("$name Say:$msg")
    }

    override fun toString(): String { //重写方法
        return "User:$name"
    }
}

class AndroidUser(name: String,var password: String,var Drv:String): User(name,password) {
    init {
        println("Android init")
    }

    override fun say(msg:Any) = println("$name Say:$msg") //重写方法 简写

}

class iOSUser(name: String,var password: String,var iosVersion:String): User(name) {
    init {
        println("iOS init")
    }

    override fun say(msg: Any) { //重写方法
        print("override say func\n")
        super.say(msg)
    }
}

fun main(args: Array<String>) {
    val xiaomiUser = AndroidUser("djcash", "123456", "xiaomiNote")
    xiaomiUser.say("my Drv:${xiaomiUser.Drv}")

    var iosUser = iOSUser("charley", "456789", "7.1.1")
    iosUser.say("my Version: ${iosUser.iosVersion}")

}

