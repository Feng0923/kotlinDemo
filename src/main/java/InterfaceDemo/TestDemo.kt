package InterfaceDemo

import kotlin.concurrent.thread

fun main(args: Array<String>) {
    val x  = X.getInstance()
    x.print()
    val a:A = x
    a.print()
    thread {  }
}