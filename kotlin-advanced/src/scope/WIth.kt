package scope

// with는 결과 반환 없이 내부에서 수신 객체를 이용해서 다른 함수를 호출하고 싶을 떄 사용된다.
// with는 확장 함수가 아니다.
fun main() {
    val str = "안녕하세요"

    // 함수의 마지막에 작성한 코드가 결과가 된다.
    var length = with(str) {
        println("length= $length")
        length
    }
    println(length)
}