package NumberPrograms

class GreatestDigit {
}
fun main(){
    println("Enter the number")
    var num = readln().toInt()

    var greatestDigit: Int = 0
    while(num > 0){
        var rem = num % 10
        num = num / 10
        if(rem > greatestDigit)
            greatestDigit = rem
    }
    println(greatestDigit)
}