package Kotlin_Class

class Person(private var name: String){
    init {
        println("主构造函数: name:$name") //主构造函数
    }

    private var age: Int? = 0
    constructor( name: String, age: Int):this(name){//调用了主构造函数
        this.age = age
        println("次构造函数: name:$name,age:$age") //次构造函数
    }
    companion object { //不用类的实例就能够调用的field
        val sss = "asfdjaskld"
        fun static(){
            println("static")
        }
    }
}