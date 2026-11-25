package NumberPrograms

class GcdNum {
}
fun main(){
    println("Enter Number1")
    var num1 = readln().toInt()
    println("Enter Number2")
    var num2 = readln().toInt()

    var greatestNum = 0
    if(num1 > num2) greatestNum = num1
    else greatestNum = num2

    println(greatestNum)
    var gcd = 0
    for(i in 1..greatestNum/2){
        if(num1 % i == 0 && num2 % i == 0){
            gcd = i
        }
    }
    println("GCD :${gcd}")
}