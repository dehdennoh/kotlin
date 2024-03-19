class dog(var name:String,var breed:String,var weight:Int){

    fun move(movement:String){
        println("The dog is $movement")
    }

}

fun main() {
    var dog1=dog("Murife","Chiwawa",24)
    var dog2=dog("Bosco","Pitbull",33)

    println(dog1.breed)

    dog2.move("Running")
    dog1.move("walking")
}