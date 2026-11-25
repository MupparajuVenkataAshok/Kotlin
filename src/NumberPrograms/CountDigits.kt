package NumberPrograms

class CountDigits {
}
fun main(){
    println("Enter Number")
    var num = readln().toInt()

    var count = 0
    while(num>0){
        num = num/10
        count++
    }
    println("Count of Digits : $count")

}