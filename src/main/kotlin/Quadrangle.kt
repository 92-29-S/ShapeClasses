import kotlin.math.sqrt

class Quadrangle(info_side1: Float): Shape() {
    private var side1: Float = 0.0F
    private var side2: Float = 0.0F
    private var side3: Float = 0.0F
    private var side4: Float = 0.0F

    init {
        type = "Quadrangle"
        side1 = info_side1
        side2 = info_side1
        side3 = info_side1
        side4 = info_side1
    }
    constructor () : this(0.0F)

    constructor (info_side1: Float, info_side2: Float) : this(info_side1) {
        side2 = info_side2
        side3 = info_side2
        side4 = info_side2
    }
    constructor (info_side1: Float, info_side2: Float, info_side3: Float) : this(info_side1, info_side2) {
        side3 = info_side3
        side4 = info_side3
    }
    constructor (info_side1: Float, info_side2: Float, info_side3: Float, info_side4: Float) : this(info_side1, info_side2, info_side3) {
        side4 = info_side3
    }

    override fun getPerimeter(): Float {
        return side1+side2+side3+side4
    }
    override fun getArea(): Float {
        return sqrt((side1+side2+side3-side4)/2 * (side1+side2-side3+side4)/2 * (side1-side2+side3+side4)/2 * (-side1+side2+side3+side4)/2)
    }

    override fun toString(): String {
        return "Shape:{type = ${type}, side1 = ${side1}, side2 = ${side2}, side3 = ${side3}, side4 = ${side4}}"
    }
}