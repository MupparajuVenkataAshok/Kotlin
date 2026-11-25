package arrays

class PrintElements {
}
fun main(){
    var arr = arrayOf(1,2,3,4,5)
    for(i in 0..arr.size-1){
        print("${arr[i]} ")
    }
    println()
    arr.forEach { print(it) }
}