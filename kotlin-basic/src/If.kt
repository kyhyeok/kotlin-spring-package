fun main() {
    // if..else 사용
    val job = "software Developer"

    if (job == "software Developer") {
        println("개발자")
    } else {
        println("개발자아님")
    }

    // 코틀린의 if...else는 표현식이다.
    val age: Int = 10

    val str = if (age > 10) {
        "성인"
    } else {
        "아이"
    }

    // 코틀린은 삼항 연잔사자 없다. if..else가 표현식이므로 불필요하다.
    val a = 1
    val b = 2
    val c = if (b > a) b else a
}