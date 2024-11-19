package lombok

fun main() {
    val hero = Hero()

    // lombok사용 컴파일 에러
//    hero.name = "아이언맨"
//    println(hero.name)

//    hero.name = "아이언맨"
//    println(hero.name)

    val heroKt = HeroKt(name="아이언맨", age = 50, address="스타크타워")
    println(heroKt)
}