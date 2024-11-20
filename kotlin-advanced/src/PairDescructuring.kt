// f(1, 3) = 1 + 3 = 4

// f((1, 3)) = 1 + 3 = 4
//fun plus(a: Int, b: Int) = a + b
//fun plus(tuple: Tuple) = tuple.a + tuple.b

//data class Tuple(val a: Int, val b: Int)

fun plus(pair: Pair<Int, Int>) = pair.first + pair.second

fun main() {
//    println(plus(1, 3))

//    println(plus(Tuple(1, 3)))

    println(plus(Pair(1, 3)))

    // Pari는 불변
    val pair = Pair("A", 1)
//    pair.first = "B" 직접 수정 불가
    val newPair = pair.copy(first = "B")
    println(newPair)

    val second = newPair.component2();
    println(second)

    val list = newPair.toList()
    println(list)

    // Triple 역시 불변
    val triple = Triple("A", "B", "C")
    println(triple)
    triple.first
    triple.second
    triple.third
    val newTriple = triple.copy(third = "D")
    println(newTriple)

    println(newTriple.component3())

    // 구조분해할당
//    val (a, b, c) = newTriple
    val (a: String, b: String, c: String) = newTriple
    println("$a, $b, $c")


    val list3: List<String> = newTriple.toList()
    val (a1, a2, a3) = list3
    println("$a1, $a2, $a3")

    // list는 5개의 component를 제공해준다.
    list3.component1()
    list3.component2()
    list3.component3()

    //3개만 있으므로 IndexOutOfBounds 에러 발생
//    list3.component4()
//    list3.component5()

//    val map = mutableMapOf("스타크" to "아이언맨")

    // to도 Pair를 쓰므로 치환할 수 있다.
    val map = mutableMapOf(Pair("스타크","아이언맨"))

    for ( (key, value ) in map) {
        println("${key}의 직업은 ${value}")
    }
}