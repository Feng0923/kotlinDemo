package Kotlin_Class

interface Animal {//抽象类描述业务
    fun bark()
}

class Dog : Animal{ // 业务的具体实现
    override fun bark() {
        println("汪!")
    }
}
class Cat(animal: Animal) : Animal by animal //将其代理给传进来的animal

fun main(args: Array<String>) {

    val dog = Dog()
    val cat = Cat(dog)
    cat.bark() //让一只猫的叫声用狗去代理
}