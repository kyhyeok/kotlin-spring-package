class NormalPerson(val name: String, val age: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as NormalPerson

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

fun main() {
    val person1 = NormalPerson(name = "tony", age = 12)
    val person2 = NormalPerson(name = "tony", age = 12)
//    println(person1 == person2)

    val set = hashSetOf(person1)
//    println(set.contains(person2))

    println(person1.toString())
}

