data class Person(
    val name: String,
    val age: Int? = 680
)


// fun findAlice() = findPerson { it.name == "alice"}
// fun findGregor() = findPerson { it.name == "gregor"}


fun main(args: Array<String>) {
    val persons = listOf(Person("alice"), Person("gregor", 413))
    val oldest = persons.maxBy { it.age ?: 0 }
    print(oldest)
}