
data class Person(val name: String, val age: Int)

// Find max age
val people = listOf(Person("bill", 23), Person("johnson", 32), Person(name = "billsworth", age = 87))

val oldestPerson = people.maxBy { it.age }
val oldestPersonAgain = people.maxBy(Person::age) // means same as above
val printAge = { println("Max age $oldestPerson once and again $oldestPersonAgain") }
val sum = { x: Int, y: Int -> x + y }

val names = people.joinToString(separator = " | ", transform = { p: Person -> p.name })

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun doThings() = println("currently doing things")
val callDoThings = run(::doThings)
fun main() {


}