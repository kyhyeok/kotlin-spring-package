class Product(val name: String, val price: Int)

interface Wheel {
    fun roll()
}
interface Cart: Wheel {

    var coin: Int

    val weight: String
        get() = "20KG"

    fun add(product: Product)

    fun rent () {
        if (coin > 0) {
            println("카트를 대여합니다")
        }
    }

    override fun roll() {
        println("카트가 굴러갑니다")
    }

    fun printId() = println("1234")
}

interface Order {
    fun add(product: Product) {
        println("${product.name} 주문이 완료되었습니다")
    }

    fun printId() = println("5678")
}

// 복수 인터페이스에서 같은 이름의 함수를 추가할 때는 super를 이용한다.
// 복수 인터페이스에서 동일한 default 함수를 제공할 경우 하위 클래스에서 default 함수에 대해 구현을 강제한다.
class MyCart(override var coin: Int): Cart, Order {

    override fun add(product: Product) {
        if (coin <= 0) println("코인을 넣어주세요")
        else println("${product.name}이(기} 카트에 추가 됐습니다")

        // 주문하기
        super<Order>.add(product)
    }

    override fun printId() {
        super<Cart>.printId()
        super<Order>.printId()
    }


}

fun main() {
    val cart = MyCart(coin = 100)
    cart.rent()
    cart.roll()
    cart.add(Product(name="장남감", price=1000))
    cart.printId()
}