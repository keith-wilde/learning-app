package strings
fun String.lastChar(): Char = this[this.length-2]

fun main() {
    println("things".lastChar())
    println(View().click())
    println(Button().click())
}

open class View {
    open fun click() = "clicking"
}
class Button:View() {
    override fun click(): String {
        return "${super.click()} overridden stuff"
    }

}