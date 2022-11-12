import kotlin.math.PI

class Circle(info_radius: Float): Shape() {
    private var radius: Float = 0.0F

    init {
        type = "Circle"
        radius = info_radius
    }
    constructor () : this(0.0F)

    override fun getPerimeter(): Float {
        return 2*radius*(PI).toFloat()
    }
    override fun getArea(): Float {
        return radius*radius*(PI).toFloat()
    }

    override fun toString(): String {
        return "Shape:{type = ${type}, radius = ${radius}}"
    }
}