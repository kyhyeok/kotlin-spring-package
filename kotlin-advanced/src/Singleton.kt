import java.time.LocalDateTime

//object Singleton {
//    val a = 1234
//
//    fun printA() = println(a)
//}
//
//fun main() {
//    println(Singleton.a)
//    Singleton.printA()
//}

//object DatetimeUtils {
//    val now : LocalDateTime
//        get() = LocalDateTime.now()
//
//    // Java의 상수와 유사하다.
//    const val DEFAULT_FORMAT = "YYYY-MM-DD"
//
//    fun same(a: LocalDateTime, b: LocalDateTime) :Boolean {
//        return a == b
//    }
//}
//
//
//fun main() {
//    println(DatetimeUtils.now)
//    println(DatetimeUtils.now)
//    println(DatetimeUtils.now)
//
//    println(DatetimeUtils.DEFAULT_FORMAT)
//
//    val now = LocalDateTime.now()
//
//    println(DatetimeUtils.same(now, now))
//}


// 동반 객체
class MyClass {
    private constructor()


    companion object {
//    companion object MyCompanion { 보통 생략해서 사용
        val a = 1234

        fun newInstance() = MyClass()
    }
}

fun main() {
    println(MyClass.a)
    println(MyClass.newInstance())


//    println(MyClass.Companion.a)
//    println(MyClass.Companion.newInstance())


//    println(MyClass.MyCompanion.a)
//    println(MyClass.MyCompanion.newInstance())

}