fun main() {

    //Breaks statement
    for (number in 30..40){
        if (number == 35){
            break
        }
        println(number)
    }

    //Continue statement
    for (num in 'a'..'h'){
        if (num == 'd'){
            continue
        }
        println(num)
    }
}