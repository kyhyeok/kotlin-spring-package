package funtional

fun main() {
//    val list = mutableListOf(printHello)
//
////    list[0]() // hello 출력
//    val func: () -> Unit = list[0] // Hello 출력
//    func() // Hello 출력

//    call(printHello) // Hello 출력

    // fun 키워드로 함수를 만들면 컴파일 오류가 난다.
//    val func = printNo
//    val list = mutableListOf(printNo) // 컴파일 오류
//    call(printNo) // 컴파일 오류

//    val result: Int = plus(1, 3)
//    println(result)

//    val result2: Int = plus3(1, 3, 5)
//    println(result2)

//    val list = listOf("a", "b", "c")
//    val printStr: (String) -> Unit = { println(it) }
//    forEachStr(list, printStr)

//    list.forEach (printStr)
//    val upperCase: (String) -> String = { it.uppercase() }
//    println(list.map(upperCase))

//    outerFunc()()

//    val func = outerFunc()
//    func()
//
//    agr1 {
//        it.length
//        it.first()
//    }
//
//    agr2 { a: String, b: String ->
//        a.length
//        a.first()
//        b.length
//        b.first()
//    }

//    val callReference : () -> Unit = { printHello() }
//    callReference()

//    val callReference = ::printHello
//    callReference()()

    val numberList = listOf("1", "2", "3")
//    numberList.map { it.toInt() }.forEach { println(it) }
    numberList.map (String::toInt).forEach(::println)
}

// 람다 레퍼런스


// 인자를 하나만 받을 때 it 사용 가능
fun agr1(block: (String) -> Unit) {}

// 인자를 두 개 이상일 때는 it 사용 불가
fun agr2(block: (String, String) -> Unit) {}


// 람다 표현식의 전체 식
val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

// 최대한 생략한 람다 식 - 위 코드와 똑같다
val sum2 = { x: Int, y: Int -> x + y }

// 이름이 없는 함수 익명 함수
fun outerFunc() :() -> Unit = { println("이것이 익명함수!") }
//fun outerFunc() :() -> Unit {
//    // 람다함수로 변경되었다.
//    return {
//      println("이것은 익명함수!")
//      }
//}

//fun outerFunc() :() -> Unit {
//    return fun () {
//        println("이것은 익명함수!")
//    }
//}

// 고차원 함수 - 함수를 인자로 받거나 함수로 결과를 반환
fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
    for (item in collection) {
        action(item)
//        println(item)
    }
}


// Unit은 반환값이 없는 함수로 Java로 따지면 void 정도
val printMessage: (String) -> Unit = { message: String -> println(message) }
//val printMessage2: (String) -> Unit = { message -> println(message) }
//val printMessage3: (String) -> Unit = { println(it) }

val plus: (Int, Int) -> Int = { a, b -> a + b }
val plus3: (Int, Int, Int) -> Int = { a, b, c -> a + b + c }

val printHello : () -> Unit = { println("Hello") }

fun printHello2() {

}

// 함수를 인자로 받아 실행하는 함수
fun call(block: () -> Unit) {
    block()
}

fun printNo() = println("No!")




//val funcStr: () -> String = { "" }
//val func: () -> Unit = {}