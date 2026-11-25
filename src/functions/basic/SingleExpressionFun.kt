package functions.basic

class SingleExpressionFun {
}
fun main(){
    println("addition : ${add(1,2)}")
    println("The given number is ${isEven(4)}")
    println("Grade of the Student : ${gradeStudent(70)}")
}
fun add(a: Int, b:Int) = a+b
fun isEven(num:Int):String = if(num%2==0) "Even " else "Odd"

fun gradeStudent(marks:Int): String = when(marks){
    in 90..100 -> "A+"
    in 70..89 -> "A"
    in 50..59 -> "B"
    else -> "Unknown"

}