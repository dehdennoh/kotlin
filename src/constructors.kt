class Employee(var firstname:String, var age:Int, var gender:String, var position:String,var salry:Double){
    fun role(task:String) {
        println("The role is $task")

    }
}

fun main() {
    var employee1=Employee("Suzan",25,"Female","Managing Director",43000.00)
    var employee2=Employee("Mark",34,"Male","Human Resourse Manager",54000.00)

    println(employee1.firstname)
    println("Employee1 is ${employee1.age} " +
            "" +
            "years old")
    println(employee1.firstname)
}