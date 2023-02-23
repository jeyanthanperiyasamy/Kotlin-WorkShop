fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")


    val circle = Shape.Circle(4.5f)
    val square = Shape.Square(4)
    val rectangle = Shape.Rectangle

    eval(circle)
    eval(square)
    eval(rectangle)

}

sealed class Shape {
    class Circle(var radius: Float): Shape()
    class Square(var length: Int): Shape()
    object Rectangle: Shape()
    {
        var length: Int = 4
        var breadth : Int = 5
    }
}

fun eval(e: Shape) =
    when (e) {
        is Shape.Circle -> println("Circle area is ${3.14*e.radius*e.radius}")
        is Shape.Square -> println("Square area is ${e.length*e.length}")
        Shape.Rectangle -> println("Rectangle area is ${Shape.Rectangle.length*Shape.Rectangle.breadth}")
        else -> { println("nothing") }
    }
