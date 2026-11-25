package NumberPrograms

class DecimalToBinary {
}
fun main(){
    println("Enter Number")
    var num = readln().toInt()

    var res = 0
    var base = 2
    var finalres = 0
    for(i in 0..10){
        finalres = finalres + pow(i)
        print("${finalres} ")
        if(finalres == num) {
            println(finalres)
            break
        }
    }
}
fun pow(n: Int): Int{
    val base = 2
    var res = 1
    if(n == 0)
        return 1
    else if(n == 1)
        return base
    else{
        for(i in 1..n){
            res = res * base
        }
    }
    return res
}
