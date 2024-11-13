fun getNullStr(): String? = null

fun getLengthIfNotNull(str: String?) = str?.length ?: 0

fun main() {
//    val a : String = null null 초기화가 안됨 (컴파일 오류)
//    val b : String = "aabbcc"
//    b = null null 재할당 안됨 (컴파일 오류)

    // nullable 타입
    var a :String? = null
    a?.length // 안전 연산자
    println(a?.length)

    val b : Int = if (a != null) a.length else 0
    println(b)

    // 엘비스 연산자 좌변이 null인 경우 우변을 return
    val c = a?.length ?: 0
    println(c)




    val nullableStr = getNullStr()

    val nullableStrLength = nullableStr?.length ?: "null인 경우 반환".length
    println(nullableStrLength)

    val length = getLengthIfNotNull(null)
    println(length)

    // nullPointException
//    throw NullPointerException()

    val cc : String? = null
//     !!은 단언 연산자
    val d = cc!!.length
}