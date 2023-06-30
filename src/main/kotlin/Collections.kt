
data class Human(val name: String, val age: Int)

val humans = listOf(Human("Tibor", 34), Human("homer", 38), Human("john", 432))

val notARealAge = { h:Human -> h.age < 130}

fun main(){


    println(humans.find(notARealAge))
    println(humans.filter(notARealAge))
    println(humans.filterNot(notARealAge))
    println(humans.filter { it.age >34 }.map { it.name })
}
