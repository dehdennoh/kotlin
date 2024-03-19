fun main() {
    //While loop
    var number = 20
    while (number <=25){
        println("Number is $number")
        number++
    }

    //Decrement
    var num = 100
    while (num >=95){
        println("Number is $num")
        num--
    }

    //Do..while loop
    var x = 34
    do {
        println(x)
        x++
    }while (x <= 40)

    //For loop
    var devices = arrayOf("Laptop","Phone","Tablet")
    for (device in devices ){
        println("Device is $device")
    }

    var marks = arrayOf(45,67,87)
    for (mark in marks){
        println("Your score is $mark")
    }
    for (mynumber in 50..60){
        println(mynumber)
    }
    for (alpha in 'a'..'d'){
        println(alpha)
    }



}