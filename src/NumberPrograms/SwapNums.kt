package NumberPrograms

class SwapNums {
}
fun main(){
    println("Enter num1: ")
    var num1: Int = readln().toInt()
    println("Enter num2: ")
    var num2: Int = readln().toInt()
    println("Before Swapping num1 : $num1, num2 = $num2 ")

    /*val temp = num1
    num1 = num2
    num2 = temp*/

    //Without using third variable
    //ex:- num1 = 1 , num2 = 2
    num1 = num1 + num2 //3
    num2 = num1 - num2 //1
    num1 = num1 - num2 //2

    println("After Swapping num1 : $num1, num2 = $num2 ")
}