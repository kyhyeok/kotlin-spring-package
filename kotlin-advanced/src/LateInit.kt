// 가변 프로퍼티에 대한 지연 초기화가 필요한 경우 사용
class LateInit {
    lateinit var text: String


    val textInitialized: Boolean
        get() = this::text.isInitialized

    fun printText() {
//        text = "안녕하세요"
//        println(text)

        // 초기화가 먼저 되지 않으면 Exception이 터진다.
//        println(text)
//        text = "안녕하세요"

//        text = "안녕하세요" // 초기화 설정하면 초기회됨 출력
        if (this::text.isInitialized) {
            println("초기화됨")
        } else {
//            text = "안녕하세요"
        }
        println(text)

    }
}

fun main() {
    val test = `LateInit`()
//    test.text = "하이"
//    test.text.isInitialized class 밖에서 사용 안 됨
    if (!test.textInitialized) { // class에서 함수를 만들어서 사용 가능
        test.text = "하이"
    }
    test.printText()
}