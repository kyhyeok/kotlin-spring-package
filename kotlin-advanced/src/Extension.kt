fun String.first(): Char {
    return this[0]
    // this는 ABCD로 수신자 객체이다.
}

fun String.addFirst(char: Char): String {
    return char + this.substring(0)
    // this는 ABCD
}

class MyExample {
    fun printMessage() = println("클래스 출력")
}

fun MyExample.printMessage() = println("확장 출력")
fun MyExample.printMessage(message:String) = println("확장 출력")

fun MyExample?.printNullOrNotNull() {
    if (this == null) println("널인 경우에만 출력")
    else println("널이 아닌 경우에만 출력")
}

fun main() {
    println("ABCD".first())

    println("ABCD".addFirst('Z'))

    // 확장 함수가 동일할 함수명일 경우 클래스가 직접 보유하고 있는 함수가 먼저 호출된다.
    MyExample().printMessage()

    MyExample().printMessage("확장 출력")

    var myExample: MyExample? = null
    // null 안전 연산자?를 사용하지 않았지만 MyExample?.printNullOrNotNull()
    // 내부에서 null에대한 처리를 하여서 npe가 발생하지 않기 때문에 컴파일 오류가 발생하지 않는다.
    myExample.printNullOrNotNull()

    myExample = MyExample()
    myExample.printNullOrNotNull()
}

