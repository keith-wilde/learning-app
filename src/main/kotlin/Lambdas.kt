
data class Person(val name: String, val age: Int)

// Find max age
val people = listOf(Person("bill", 23), Person("johnson", 32), Person(name = "billsworth", age = 87))

val oldestPerson = people.maxBy { it.age }
val oldestPersonAgain = people.maxBy(Person::age) // means same as above
val printAge = { println("Max age $oldestPerson once and again $oldestPersonAgain") }
val sum = { x: Int, y: Int -> x + y }

val names = people.joinToString(separator = " | ", transform = { p: Person -> p.name })
fun doThings() = println("currently doing things")
val callDoThings = run(::doThings)

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

val groupByName = people.groupBy { it.name }
//println(groupByName["bill"])
val groupByAge = people.groupBy { it.age }
//println(groupByAge[23])

class Book(val title:String, val authors:List<String>)
val books = listOf(Book("Some Book", listOf("Author Authorson", "Writer writerson", "John")),Book("Some Book", listOf("Author Authorson", "Writer writerson", "T.J Booker")),Book("The third book", listOf("Author Authorson", "Aldo writerson", "Rex")))
val authorsOnly = books.flatMap { it.authors }.toSet()

fun main() {
    println(authorsOnly)

}