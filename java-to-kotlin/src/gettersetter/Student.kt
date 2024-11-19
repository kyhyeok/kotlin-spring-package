package gettersetter

import java.time.LocalDate

class Student {

    @JvmField
    var name: String? = null
//    var name: String? = null

    var birthDate: LocalDate? = null

    val age: Int = 10

    var grade: String? = null
        private set
    // 내부 클래스에서만 변경 가능

    fun changeGrade(grade: String) {
        this.grade = grade
    }
}