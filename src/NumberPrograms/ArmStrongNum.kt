package NumberPrograms

class ArmStrongNum {
}
fun main(){
    println("Enter Number")
    val num = readln().toInt()

    var temp = num
    val countOfDigits = countDigits(num)
    println("Number of digits: $countOfDigits")

    var result = 0
    while(temp > 0){
        result = result + resPow(temp % 10, countOfDigits)
        temp = temp / 10
    }
    if(result == num)
        println("ArmStrong Number")
    else
        println("Not a ArmStrong Number")
}
fun resPow(a: Int, power: Int): Int {
    var res = 1
    for(i in 1..power) {
        res = res * a
    }
    return res
}
fun countDigits(num: Int) : Int{
    var count = 0
    var temp = num
    while(temp > 0){
        temp = temp / 10
        count++
    }
    return count
}