abstract class Shape() {
    protected var type: String = ""
    abstract fun getPerimeter(): Float
    abstract fun getArea(): Float
}