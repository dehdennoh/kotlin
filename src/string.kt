fun main() {
    var greeeting = "Hello world"
    var firstname = "Dennis"
    var lastname = "Denno"

    //string concatenation
    println(firstname+ " " +lastname)
    println(firstname.plus(lastname))

    //Accessing a character in a string
    println(greeeting[6])

    //Determining the index position of an element
    println(greeeting.indexOf('H'))
    println(greeeting.indexOf("world"))

    //Size of a string
    println(greeeting.length)

    //Modifying a string
    println(greeeting.uppercase())

    //String interpolation
    println("Hello there, my name is $firstname $lastname")


}