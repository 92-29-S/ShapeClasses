fun main(args: Array<String>) {
    var Shape1 = Circle(20.0F)
    var Shape2 = Triangle(80.0F, 50.0F)
    var Shape3 = Quadrangle(40.0F)

    println(Shape1.toString())
    println("Shape1_Perimeter = ${Shape1.getPerimeter()}")
    println("Shape1_Area = ${Shape1.getArea()}")
    println(Shape2.toString())
    println("Shape2_Perimeter = ${Shape2.getPerimeter()}")
    println("Shape2_Area = ${Shape2.getArea()}")
    println(Shape3.toString())
    println("Shape3_Perimeter = ${Shape1.getPerimeter()}")
    println("Shape3_Area = ${Shape1.getArea()}")
}