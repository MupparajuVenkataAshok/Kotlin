package NumberPrograms

fun main(args: Array<String>) {
    println("Enter number ")
    val num = readln().toInt()//2
    println("Enter power of num")
    val power = readln().toInt()//4

    var res = 1
    for(i in 1..power){
        res = num * res
    }
    println(res)
}