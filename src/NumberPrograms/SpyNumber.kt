package NumberPrograms

class SpyNumber {
}
fun main(){
    println("Enter Number")
    var num = readln().toInt() //123

    var addresult: Int = 0
    var productresult: Int = 1
    while(num > 0){
        addresult = addresult + num%10
        productresult = productresult * num%10
        num /= 10
    }
    if(addresult == productresult)
        println("Spy Number")
    else
        println("Not a Spy Number")
}
