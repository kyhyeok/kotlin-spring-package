package exception

enum class CountryCodeKotlin {
    kr, jp, us, `do`;
}

fun main() {
    // 코틀린에서는 백틱``으로 예약서 문제를 해결
    val javaKeyword = JavaKeyword()
    javaKeyword.`is`
    javaKeyword.`in`
}