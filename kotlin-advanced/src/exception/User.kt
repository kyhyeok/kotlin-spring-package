package exception

import java.io.FileWriter

fun main() {
    FileWriter("test.txt")
        .use {
            it.write("hello Kotlin")
        }
}