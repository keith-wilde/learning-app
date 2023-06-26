class LocalFunctions (val id: Int, var name:String?="none")

fun saveStuff(localFunctions: LocalFunctions){
    val property1 = localFunctions.id to localFunctions.name

    fun innerFunction() = " inner $property1"

    print(innerFunction())
}

fun main(){
    saveStuff(LocalFunctions(id = 9, name="stuff"))
    saveStuff(LocalFunctions(id = 10))
}