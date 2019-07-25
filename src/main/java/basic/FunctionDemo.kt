package basic


fun main(args: Array<String>) {
    funTest(1,2,3,4)
}
/*
    变参函数,
    在Kotlin中，使用关键字vararg来表示
 */
fun funTest(vararg x: Any): Unit {
    for (item in x) println(item)
}
/*
    拓展函数
    你可以给父类添加一个方法，这个方法将可以在所有子类中使用
    例如，在 Android 开发中，我们常常使用这样的扩展函数：
 */
/*
fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}
*/
