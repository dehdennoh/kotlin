import java.awt.Shape

//Parent class
open class shape{
    open fun draw(){
        println("Drawing a shape")
    }
}
//Child class
class Rhombus:shape(){
    override fun draw(){
        println("Drawing a rhombus")
    }
}
class parallelogram:shape(){
    override fun draw(){
        println("Drawing a parallelogram")
    }
}

fun main() {
    var s = shape()
    s.draw()

    var r = Rhombus()
    r.draw()

    var p = parallelogram()
    p.draw()
}