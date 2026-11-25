package NumberPrograms

class FibonacciSeries {
}
fun main(){
    println("Enter a no.of terms value")
    val n =readln().toInt()

    if(n <= 0){
        println("Enter Positive Number")
        return
    }
    var num1 =0
    var num2 = 1
    var num3: Int
    print("$num1, $num2, ")
    for(i in 1..n-2){
        num3 = num1 + num2
        print("$num3, ")

        num1 = num2
        num2 = num3
    }
}