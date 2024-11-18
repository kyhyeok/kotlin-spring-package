//class MyGenerics<T>(val t: T) {
//
//}

/**
 * CharSequence가 String의 상위 타입이기 때문에
 * out키워드를 사용해서 공변성을 구현할 수가 있다.
 */
class MyGenerics<out T>(val t: T) {
}

/**
 *
 */
class Bag<T> {
    fun saveAll(
        to: MutableList<in T>,
        from: MutableList<T>,
    ) {
        to.addAll(from)
    }
}

fun main() {
    val bag = Bag<String>()

    // 컴파일 오류 발생 - 제네릭을 소비하는 측이 되므로 반공변성을 사용해야 한다.
    bag.saveAll(mutableListOf<CharSequence>("1", "2"), mutableListOf<String>("3", "4"))


//    val generics = MyGenerics<String>("테스트")
//    val charGenerics: MyGenerics<CharSequence> = generics

    // 제네릭을 사용한 클래스의 인스턴스를 만드려면 타입아규먼트를 제공
//    val generics = MyGenerics<String>("테스트")

    // 생략 가능
//    val generics = MyGenerics("테스트")
//
//    // 변수의 타입에 제네릭을 사용한 경우
//    val list1: MutableList<String> = mutableListOf()
//
//    // 타입아규먼트를 생성자에서 추가
//    val list2 = mutableListOf<String>()
//
//    val list3: List<*> = listOf<String>("테스트")
//    val list4: List<*> = listOf<Int>(1, 2, 3, 4)

    // 변성

    // PECS(Producer-Extends, Consumer-Super)
    // 공변성은 자바 제네릭의 extends, 코틀린에서는 out 키워드 사용
    // 반공변성은 자바 제네릭의 super, 코틀린에서는 in 키워드 사용
}