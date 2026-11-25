package NumberPrograms

class FizzBuzz {
}
fun main(){
    println("Enter the Number ")
    val num:Int = readln().toInt()

    if(num%3 == 0 && num%5 == 0)
        println("FizzBuzz")
    else if(num%3 ==0)
        println("Fizz")
    else if(num%5 ==0)
        println("Buzz")
    else
        println("InValid")
}