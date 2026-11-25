package functions.basic

class LamdaExpFun {
}
fun main(){
    //Lamda Functions.
    val sum =  {a:Int, b:Int -> a+b}(5,6)
    print(sum)

    val numsList = listOf(2,3,4,5,9)
    val result = numsList.map{
        it*2
    }
    println(result)
}
