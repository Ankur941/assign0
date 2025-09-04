## Inheritance
DocViewer
Page
of 2
Pages
CIS 3515 Assignment 0
Instructions: This assignment will test your knowledge of inheritance and interfaces, encapsulation, and
polymorphism in Kotlin.
1. Using IDEA (this is the preferred IDE), create a class called Shape using the following code
snippet:
abstract class Shape (_name : String) : Dimensionable{
var name = _name
fun getArea() {
return 0.0;
}
}
2. Create 4 additional classes and the interface specified above as follows:
3. In the Dimensionable interface, add the following function de:
fun printDimensions()
4. For each additional class do the following:
1. Have a constructor that takes a name, which it turn invokes the constructor of its superclass.
2. Implement a setDimensions() function that will take the following parameters:
1. Square: length and height
2. Circle: radius
3. Triangle: 3 sides
4. EquilateralTriangle: 1 side
3. Implement the printDimensions() function specified in the Dimensionable interface to print
the dimensions of the current shape.
4. Override the getArea() funtion of the superclass to calculate the correct area for each shape.
For triangles, use Heron's Formula:
area = √ (s (s-a) (s-b) (s-c))
where a,b, and c are the lengths of the sides, and s = ½ the perimeter
5. From your main function (Main.kt → fun main())
1. Create one instance of each class and store each in a variable of type Shape
2. Prompt the user to enter the dimensions for each object
(https://www.programiz.com/kotlin-programming/input-output)
3. Once all objects have been created, print the name, dimensions, and area for each object
to the screen with appropriate headings (https://kotlinlang.org/docs/typecasts.html)
6. Commit and Push your completed assignment to GitHub, and submit the assignment
repository URL to Canvas
Annotations
