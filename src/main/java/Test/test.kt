package Test

public fun th(block: ()->Unit):Thread{
    val thread = object : Thread() {
        override fun run() {
            for (i in 0..2)
            block()
        }
    }
    thread.start()
    return thread
}