package NumberPrograms

class ReverseNumber {
}
fun main(){
    println("Enter Number: ")
    var num = readln().toInt()

    var temp = 0
    while(num>0){
        val rem = num % 10
        temp = temp*10 + rem
        num = num/10
    }
    println("Reverse Number: $temp")
}