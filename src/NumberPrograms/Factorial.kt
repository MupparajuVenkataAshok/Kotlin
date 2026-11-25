package NumberPrograms

class Factorial {
}
fun main(){
    println("Enter Number")
    var num = readln().toInt()

    var res = 1
    for(i in 1..num){
        res = res * i
    }
    println("Factorial Result: $res")
}