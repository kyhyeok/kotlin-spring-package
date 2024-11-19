class HelloBot {
//    var greeting: String? = null;
    // 불변유지하며 생성 시점에서 getHello()
    // by lazy 멀티쓰레드에서도 안전하게 작동하도록 설계
    // LazyThreadSafetyMode.NONE by lazy의 기본값을 SYNCHRONIZED이다
    // 동기화가 필요하지 않을 경우 PUBLICATION로 사용해도 된다. (오버헤드가 발생하지 않는다)
//    val greeting: String by lazy() {
    val greeting: String by lazy(LazyThreadSafetyMode.NONE) {
        println("초기화 로직 수행")
        getHello()
    }

    fun sayHello() = println(greeting)
}

fun getHello() = "안녕하세요"

fun main() {
    val helloBot = HelloBot()

    // var gretting
//    helloBot.greeting = getHello()
//    helloBot.sayHello()


    // val greeting: String by lazy
//    helloBot.sayHello()
//    helloBot.sayHello()
//    helloBot.sayHello()
    // 초기화 로직 수행은 한 번만 호출

    for (i in 1..5) {
        Thread {
            helloBot.sayHello()
        }.start()
    }
}