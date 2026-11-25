package functions.basic

class HigherOrderFun {
}
fun main(){
    val result = calculate(3,5,{a,b -> a*b})
    println("result : $result")
}
fun calculate(a: Int, b: Int,operation: (c:Int,d:Int)->Int):Int{
    return operation(a,b)
}