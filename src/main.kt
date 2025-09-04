import kotlin.math.sqrt
import kotlin.math.PI

// Interface for shapes
interface Dimensionable {
    //fun area(): Double
    //fun perimeter(): Double
    fun printDimensions()
}

// Abstract Shape class
abstract class Shape : Dimensionable {
    abstract val name: String

    open fun area(): Double = 0.0



    fun displayInfo() {
        println("Shape: $name")
        println("Area: ${area()}")
        //println("Perimeter: ${perimeter()}")
        printDimensions()
        println()
    }
}

// Square class
class Square(private val side: Double) : Shape() {
    override val name = "Square"

    override fun area(): Double = side * side
    //override fun perimeter(): Double = 4 * side

    override fun printDimensions() {
        println("Side: $side")
    }
}

// Circle class
class Circle(private val radius: Double) : Shape() {
    override val name = "Circle"

    override fun area(): Double = PI * radius * radius
    //override fun perimeter(): Double = 2 * PI * radius

    override fun printDimensions() {
        println("Radius: $radius")
    }
}

//Triangle class
open class Triangle(val a: Double, val b: Double, val c: Double) : Shape() {
    override val name: String = "Triangle"

    override fun area(): Double {
        val s = (a + b + c) / 2
        return sqrt(s * (s - a) * (s - b) * (s - c)) // Heron's formula
    }

   // override fun perimeter(): Double = a + b + c

    override fun printDimensions() {
        println("Sides: a=$a, b=$b, c=$c")
    }
}

// Equilateral Triangle
class EquilateralTriangle(private val side: Double) : Triangle(side, side, side) {
    override val name: String = "Equilateral Triangle"

    override fun area(): Double = (sqrt(3.0) / 4) * side * side

    //override fun perimeter(): Double = 3 * side

    override fun printDimensions() {
        println("Side: $side")
    }
}


fun main() {
    val square = Square(4.9)
    square.displayInfo()

    val circle = Circle(3.0)
    circle.displayInfo()

    val triangle = Triangle(3.0, 4.0, 5.0)
    triangle.displayInfo()

    val eqTriangle = EquilateralTriangle(6.0)
    eqTriangle.displayInfo()
}
