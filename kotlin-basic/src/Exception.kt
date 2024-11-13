
fun main() {
    Thread.sleep(1) // checked exception을 강제하지 않는다

    // 직접 예외처리 작업을 해도 된다
    try {
        Thread.sleep(1)
    } catch (e: Exception) {
        println("에러 발생!")
    }

    try {
        throw Exception()
    } catch (e: Exception) {
        println("에러 발생!")
    } finally {
        println("finally 실행")
    }

    // try도 표현식으로 사용할 수 있다
    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("예외 발생!")
    }
    println(a)


    // Exception 직접 발생
//    throw Exception("예외 발생!")
    val b : String? = null
//    val b : String? = "널이 아님"
//    val c = b ?: failFast("a is null")
    val c: String = b ?: failFast("a is null")
//    failFast("예외 발생!!")
    println(c.length)

    // 엘비스 연산자와 Nothing 같이 사용하면 null이 나올 가능성은 0

    println("이 메세지는 출력될까?") // 컴파일러가 경고를 해준다.
}

// 코드가 정상적으로 수행되는 것을 보장하지 않는 경우 Nothing return
fun failFast(message: String): Nothing {
    throw IllegalArgumentException(message)
}