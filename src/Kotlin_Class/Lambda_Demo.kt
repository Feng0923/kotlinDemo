package Kotlin_Class

/**
 * 当参数只有一个的时候，声明中可以不用显示声明参数，在使用参数时可以用 it 来替代那个唯一的参数。
 *当有多个用不到的参数时，可以用下划线来替代参数名(1.1以后的特性)，但是如果已经用下划线来省略参数时，是不能使用 it 来替代当前参数的。
 *Lambda 最后一条语句的执行结果表示这个 Lambda 的返回值
 */
val mPrint = {
    msg: String -> println(msg)
}

fun main(args: Array<String>) {
    mPrint.invoke("Veng")
    //可以省略invoke
    mPrint("Veng")
//    async
}