data class Point(val x: Int, val y: Int){
    operator fun plus(other:Point): Point {
        return Point(x +other.x, y + other.y)
    }
}
// Below is doing same thing as above, just with extension function
operator fun Point.minus(other: Point): Point{
    return Point(x - other.x, y-other.y)
}


fun main (){
    var list = listOf(1,2)
    list += 3
    val newlist = list + listOf(5,6)

    println(newlist)
}
