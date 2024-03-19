//Parent class/Base class/Super class
open class animal{
    var age = 3
    var gender = "Female"

    fun move(movement:String){
        println("Animal is $movement")
    }
}
//Child class
open class Duck:animal(){
    var colour = "White"
    fun sound(){
        println("The duck is quacking")
    }
}

class Fish:Duck(){
    var hasScale = true
    var hasFins = true
    fun eat(){
        println("Fish is eating")
    }
}

fun main() {
    var elephant = animal()


    var duckling = Duck()
    duckling.move("Swimming")
    println(duckling.colour)


    var nileperch = Fish()

}