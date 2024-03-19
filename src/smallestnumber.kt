import java.util.Scanner

fun main() {
    var sd = Scanner(System.`in`)

    print("Enter first number :")
    var  first = sd.nextInt()
    print("Enter second number :")
    var second = sd.nextInt()
    print("Enter third number :")
    var third = sd.nextInt()

    if (first < second && first < third){
        println("$first is the smallest number")
    }
    else if (second < first && second < third){
        println("$second is the smallest number")
    }
    else{
        println("$third is the smallest number")
    }

}