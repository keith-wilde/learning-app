val String.firstChar: Char
    get() = get(0)

val Boolean.valueOf: Boolean
    get() = false

fun main() {
    println("stuff".firstChar)
    print(true.valueOf)
}