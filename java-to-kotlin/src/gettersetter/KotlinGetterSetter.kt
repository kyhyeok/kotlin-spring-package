package gettersetter

fun main() {
    // 자바 스타일
    val person = Person()
    person.setName("토니스타크")
    person.setAge(44)
    person.setAddress("스타크타워")

    println(person.getName())
    println(person.getAge())

    // 코틀린 스타일

    val person2 = Person()
    person2.name = "타노스"
    person2.age = 500

    println(person2.name)
    println(person2.age)


    // 프로퍼티가 없음에도 게터(메서드의 시작이 get으로 시작하기 떄문에) 메세드라면 프로퍼티처럼 사용 가능하다
    println(person2.uuid)

    // 세터가 있음에도 컴파일 오류가 발생한다.
//    person2.address = ""

    // address를 가져오는 메서드를 게터가 아닌 my로 했기 때문에 세터도 생성되지 않는다.
    person2.myAddress()
}