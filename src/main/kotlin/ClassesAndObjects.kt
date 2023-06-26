interface Clickable {
    fun click()

    fun implementedMethod() = println("implemented method")
}

abstract class Pushable{
    abstract fun pushed()
}

open class Stuff {
    open fun things() = "things"
}

class NewStuff: Stuff() {
    override fun things() = "other things"
}
interface Digital {
    fun doStuff()
}
class Button:Clickable, Pushable() {
    override fun click() {
        println("button click")

    }

    override fun pushed() {
        println("Button pushed ")
    }

    /**
     * Inner classs
     */
    class DigitalButton:Digital{
        override fun doStuff() {
            println("doing stuff, outer class ${this@DigitalButton.javaClass}")
        }

    }
}

fun main(){
    Button().click()
    Button().implementedMethod()
    var button2 = Button()
    button2.pushed()

    Button.DigitalButton().doStuff()

}