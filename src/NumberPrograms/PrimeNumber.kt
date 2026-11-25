package NumberPrograms

class PrimeNumber {
}
fun main(){
    println("Enter a Number")
    val num = readln().toInt()

    var count = 0
    for(i in 1..num){
        if(num%i == 0)
            count++
    }
    if(count == 2) println("Prime Number")
    else println("Not a PrimeNumber")
}