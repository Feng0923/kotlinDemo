package basic

/*
    空指针检测
    例如这句代码 println(files?.size)，只会在files不为空时执行。
    Kotlin 是空指针安全的，也就意味着你不会再看到那恼人的空指针异常
 */
fun main(args: Array<String>) {
    var array : Array<Any>? = arrayOf("a",1,3)
    array = null
    array?.let {//当array不为空的时候,执行
        println(array?.size)
    }
    array?: println( "array is null")
}