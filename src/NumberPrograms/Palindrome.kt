package NumberPrograms

class Palindrome {
}
fun main(){
    println("Enter Number")
    var num = readln().toInt()
    var temp = num
    var rev = 0
    while(num>0){
        rev = rev*10 + num%10
        num = num/10
    }
    if(temp == rev)
        println("Palindrome!")
    else
        println("Not a Palindrome!")
}