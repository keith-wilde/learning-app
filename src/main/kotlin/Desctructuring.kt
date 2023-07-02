data class NamedComponent(val name:String, val extension: String)

fun splitFileName(fullName:String):NamedComponent {
    val result = fullName.split(".", limit = 2)
    return NamedComponent(result[0], result[1])
}

fun main(){
    println("Filename ${splitFileName("bill.txt")}")



    val p = Point(1,2)
    val(x,y) = p
    println("X $x")
    println("Y ${y.javaClass}")
}