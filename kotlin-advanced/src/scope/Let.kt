package scope

// Let은 null아 아닌 경우 사용될 로직을 작성하고 새로운 결과를 반환하고 싶은떄 사용된다.
fun main() {
//    val str: String? = null

//    str?.let {
//        println(it)
//    }

    val str: String? = "안녕"

    val result: Int? = str?.let {
        println(it)

        // let 을 충첩해서 사용하는 것은 코드 가독성에 안 좋다.
//        val abc: String? = "abc"
//        val def: String? = "def"
//        abc?.let {
//            val def: String? = "def"
//            def?. let {
//                println("abcdef가 null이 아님")
//            }
//        }

        // 상황에 따라 if문이 더 간단할 수 있다.
        val abc: String? = "abc"
        val def: String? = "def"
        if (!abc.isNullOrEmpty() && !def.isNullOrEmpty()) {
            println("abcdef가 null이 아님")
        }

        1234
    }

    println(result)

    val hello= "hello"
    val hi = "hi"

    hello.let { a: String ->

        // it이 어느 let의 it인지 구분할 수 없음
//        println(it.length)
        println(a.length)
        hi.let { b: String ->
            // 안에서도 외부와 내부 중 어느 it 인지 구분하기 어려움
//            println(it.length)
//            println(it.length)
            println(a.length)
            println(b.length)
        }


    }
}