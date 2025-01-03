import java.util.*
import java.util.stream.Collectors

fun main() {
    // immutable
    var currencyList = listOf("달러", "유로", "원")


    // mutable
    val mutableCurrencyList: MutableList<String> = mutableListOf<String>().apply {
        this.add("달러")
        add("유로")
        add("원")
    }
    mutableCurrencyList.add("파운드")

    // immutable set
    val numberSet = setOf(1, 2, 3, 4)

    // mutable set
    val mutableSet = mutableSetOf<Int>().apply {
        this.add(1)
        add(2)
        add(3)
        add(4)
    }

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2, "three" to 3)

    // mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1
    mutableNumberMap["two"] = 2
    mutableNumberMap["three"] = 3

    // 컬렉션 빌더는 내부에센 mutable 반환은 immutable
    val numberList: List<Int> = buildList{
        add(1)
        add(2)
        add(3)
        add(4)
    }
//    numberList.add(5) 안 됨

    // linkedList
    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }

    // arrayList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = currencyList.iterator()
//    while (iterator.hasNext()) {
//        println(iterator.next())
//    }
//
//    println("====================")

//    for (currency in currencyList) {
//        println(currency)
//    }

//    println("====================")
//
//    currencyList.forEach {
//        println(it)
//    }

    // for loop -> map
    val lowerList = listOf("a", "b", "c")
//    val upperList = mutableListOf<String>()

//    for (lowerCase in lowerList) {
//        upperList.add(lowerCase.uppercase())
//    }

    val upperList = lowerList.map { it.uppercase() }
//    val filteredList = mutableListOf<String>()
//    for (upperCase in upperList) {
//        if (upperCase == "A" || upperCase == "C") {
//            filteredList.add(upperCase)
//        }
//    }

    val filteredList = upperList.filter {
        it == "A" || it =="C"
    }
    println(filteredList)

    // Java version
    val filteredJavaList = upperList.stream().filter {it == "A" || it =="C"}
        .collect(Collectors.toList())

    // 체인이 많아지거나 다루는 데이터가 많으면 시퀀스를 사용하는 것도 고려하자.
    val filteredListOperator = upperList
        .asSequence()
        .filter {it == "A" || it =="C"}
        .toList()


}