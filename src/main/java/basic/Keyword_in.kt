package basic

/*
    判断一个对象是否在某个区间,可以使用in
 */
fun main(args: Array<String>) {
    val x = 8
    if(x in 0..8) println("OK") //如果存在区间[0,8],就打印

    val array = arrayOf("1","2","3")
    if(x !in 0..array.lastIndex) println("Out") //如果x不存在该区间,则打印

    for (i in 1..5) println(i) //打印1到5

    for (item in array) println(item) // 遍历

    val text = "2"
    if(text in array) println("yes") //判断text对象是否在array中

//    for (i )

}