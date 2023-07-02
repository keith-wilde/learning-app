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

class Book(val title: String, val authors: List<String>)

val books = listOf(
    Book("Some Book", listOf("Author Authorson", "Writer writerson", "John")),
    Book("Some Book", listOf("Author Authorson", "Writer writerson", "T.J Booker")),
    Book("The third book", listOf("Author Authorson", "Aldo writerson", "Rex"))
)
val authorsOnly = books.flatMap { it.authors }.toSet()

// higher order functions.  (function that takes a function)
val sum2: (Int, Int) -> Int = { x, y -> x + y }
val action: () -> Unit = { println("action function called") }

//Calling functions passed as arguments
fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3);
    println("result is $result")
}
//twoAndThree { a, b -> a * b }
//twoAndThree(sum)

val peoples =
    listOf(Person(name = "Alice", age = 437), Person(name = "Max Power", age = 7), Person(name = "Wadsworth", age = 47))

// Returning from lambda function
fun lookForAlice(people: List<Person>) {
    for (person in peoples) {
        if (person.name == "Alice") {
            println("found") //would only be printed once
            return; // non local return
        }
    }
}

//Local returns with label
fun lookEvenMoreForAlice(people: List<Person>) {
    people.forEach label@{
        if (it.name == "Alice") {
            return@label
//            return@forEach could also do it this way if remove the label@ above
        }
        println("I don't even know anymore") // this line always printed
    }
}

fun main() {
    lookForAlice(people)
    lookEvenMoreForAlice(peoples)
}