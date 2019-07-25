package basic

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val input = scan.nextInt()
    val a = IntArray(input)
    val random = Random()
    for (i in 0 until input){
        a[i] = random.nextInt(1000000)
    }
    val startTime = System.currentTimeMillis()
    sort(a)
    var min = a[1]-a[0]
    for(i in 1 until input){
        val t = a[i]-a[i-1]
        if(t<min){
            min = t
        }
    }
    println(min)
    val endTime = System.currentTimeMillis()
    val time = endTime-startTime
    println("$time ms")
}

fun sort(a: IntArray) {
    val length = a.size
    for(i in 0 until length-1) {
        for (j in i + 1 until length) {
            if(a[i]>a[j]){
                val t = a[i]
                a[i] = a[j]
                a[j] = t
            }
        }
    }
}
