sealed class Developer {
    abstract val name: String
    abstract fun code(language: String)
}

//abstract class Developer {
//    abstract val name: String
//    abstract fun code(language: String)
//}

data class BackendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("저는 백엔드 개발자입니다. ${language}를 사용합니다.")
    }
}

data class FrontendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("저는 프론트엔드 개발자입니다. ${language}를 사용합니다.")
    }
}

// sealed class로 작성이 된 상위 클래스 같은 경우 하위 클래스가 추가되면 when식에서 구현을 해 주어야 한다.
object OtherDeveloper: Developer() {
    override val name: String = "익명"

    override fun code(language: String) {
        TODO("Not yet implemented")
    }
}

data class AndroidDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("저는 안드로이드 개발자입니다. ${language}를 사용합니다.")
    }
}

data class IosDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("저는 안드로이드 개발자입니다. ${language}를 사용합니다.")
    }
}

object DeveloperPool {
    val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when(developer) {
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper -> pool[developer.name] = developer
        is AndroidDeveloper -> pool[developer.name] = developer
        is IosDeveloper -> pool[developer.name] = developer
        is OtherDeveloper -> println("지원하지 않는 개발자입니다.")
        else -> { println("지원하지 않는 개발자입니다.") } /*abstract class일경우 else 필요*/
        // else 코드는 의도대로 작동하지 않는 버그를 일으킬 수 있다.
    }

    fun get(name: String) = pool[name]
}

fun main() {
    val backendDeveloper = BackendDeveloper(name="tony")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloper(name="stranger")
    DeveloperPool.add(frontendDeveloper)

    val androidDeveloper = AndroidDeveloper(name="android")
    DeveloperPool.add(androidDeveloper)

    println(DeveloperPool.get("tony"))
    println(DeveloperPool.get("stranger"))
    println(DeveloperPool.get("android"))
}