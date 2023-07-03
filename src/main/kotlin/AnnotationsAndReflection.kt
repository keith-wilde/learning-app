import kotlin.reflect.full.memberProperties

@Deprecated("Use some other func() instead", ReplaceWith("someNewFunc()"))
fun someFunc(){
    println("some old func")
}

fun someNewFunc(){
    println("some new func")
}

//@Target(AnnotationTarget.PROPERTY)
//annotation class JsonName(val name: String)

fun reflection(){
    val person = Person("henry", 32)
    val personClass = person.javaClass.kotlin
//    println(personClass.simpleName)

    personClass.memberProperties.forEach { println("$it.name") }
}

fun main(){
    reflection()
}