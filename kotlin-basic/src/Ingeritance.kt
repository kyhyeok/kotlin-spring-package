// 코틀린 상속은 기본이 final로 상속이 불가능하다.
open class Dog {
    open var age: Int = 0

    open fun bark() {
        println("멍멍")
    }
}

// open 상속가능, final로 따로 상속 X
open class Bulldog(final override var age: Int = 0) : Dog() {
//    override var age: Int = 0

    final override fun bark() {
        super.bark()
    }
}

abstract class Developer {
    abstract var age: Int
    abstract fun code(language: String)
}

class BackendDeveloper(override var age: Int = 0): Developer() {

    override fun code(language: String) {
        println("I code with $language")
    }
}

fun main() {
    val backendDeveloper = BackendDeveloper(age = 20)
    println(backendDeveloper.age)
    backendDeveloper.code("Kotlin")
    
//    val dog = Bulldog(age = 2)
//    println(dog.age)
//    println(dog.bark())
}