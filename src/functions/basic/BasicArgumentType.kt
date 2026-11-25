package functions.basic

class BasicArgumentType {
}
fun main(){
    //RunTime input.
    println("Enter name :")
    val name: String = readln()
    println("name : $name")
    println("Enter age :")
    val age = readln().toInt()
    println("age : $age")


    // Three types of arguments we can pass..
    //postional arguments
    println(greet("Ashok",24))

    //named arguments
    println(greet(name,age))
    println(greet(age = 24, name = "Harish"))

    //Default Arguments
    println(greet("Chinna"))
}
fun greet(name:String, age:Int = 30): String{
    return "name is $name, $age years old"
}