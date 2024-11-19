package exception

import java.io.IOException

class KotlinThrow {
    @Throws(IOException::class) // 예외 전파(예외 폭탄 돌리기)
    fun throwIOException() {
        throw IOException("체크드 익셉션인 IOException 발생")
    }
}

fun main() {
    val javaThrow = JavaThrow()
    javaThrow.throwIOException()

    val kotlinThrow = KotlinThrow()
    kotlinThrow.throwIOException()
}