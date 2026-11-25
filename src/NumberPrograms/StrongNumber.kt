package NumberPrograms

class StrongNumber {
}
fun main(){
    println("Enter number:")
    val num = readln().toInt()

    var temp = num
    var resSum = 0
    while(temp > 0){
        resSum = resSum + fact(temp%10)
        temp /= 10
    }
    if(resSum == num) println("Strong Number")
    else println("Weak Number")
}
fun fact(n: Int) : Int{
    var res = 1
    for(i in 1..n){
        res = res * i
    }
    return res
}