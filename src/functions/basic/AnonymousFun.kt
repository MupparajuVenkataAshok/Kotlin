package functions.basic

class AnonymousFun {
}
fun main(){
    val isEven = fun (num:Int):Boolean{
        return num%2==0
    }
    if(isEven(3)) println("Even") else println("odd")
}
