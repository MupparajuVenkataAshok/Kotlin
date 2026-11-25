package NumberPrograms

class KthPositionDigit {
}
fun main(){
    println("Enter number")
    val num = readln()
    println("Enter K-th position value")
    val k = readln().toInt()

        println("K-th position is ${num[k-1]}")
}