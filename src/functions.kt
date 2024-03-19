fun main() {
    //Predefined functions
    var y = Math.sqrt(169.0)
    println("The squareroot 169.0 is $y")

    var x = Math.min(45,134)
    println("Minimum value is $x")

    var i = Math.round(67.45)
    println(i)

    name()
    quotient(12,3)
    quotient(12,2)
    developers("Johnson",23)
}
//User defined functions
fun name (){
    println("Deno")
}

fun quotient(w1:Int, w2:Int){
    println(w1/w2)
}

fun developers(name:String,age:Int){
    println("$name is $age years old")
}