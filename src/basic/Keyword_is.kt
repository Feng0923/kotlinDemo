package basic

/*
    判断对象是否是某个类的实例
 */
fun main(args: Array<String>) {
    val str = 1
    getLength(str)
}

fun getLength(x: Any): Unit {
    when (x) {
        is String -> println(x.length) //做过判断后x自动转型为string
        !is String -> println("no") //可以用!is,取反
    }
}