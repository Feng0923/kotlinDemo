package ClassDemo

fun main(args: Array<String>) {
    val lazyValue: String by lazy { println("Computed");"Hello" }
    println(lazyValue)
    println(lazyValue)
}