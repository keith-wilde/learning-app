import java.time.LocalDate

data class Human(val name: String, val age: Int)

val humans = listOf(Human("Tibor", 34), Human("homer", 38), Human("john", 432))

val notARealAge = { h:Human -> h.age < 130}

//how to see if something in collection
val tiborInCollection = Human("Tibor", 34) in humans

val now = LocalDate.now()
val vacation = now..now.plusDays(10)
val rangeCheck = now.plusWeeks(1) in vacation

fun main(){
//    println("NOW: $now ")
    println("Vacation: ${vacation.javaClass}")
//    println("Is one week in range $rangeCheck")


//    println(humans.find(notARealAge))
//    println(humans.filter(notARealAge))
//    println(humans.filterNot(notARealAge))
//    println(humans.filter { it.age >34 }.map { it.name })
}
