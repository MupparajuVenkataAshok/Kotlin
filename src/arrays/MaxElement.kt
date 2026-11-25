package arrays

class MaxElement {
}
fun main(){
    var arr = arrayOf(1,21,13,64,15)
    var maxElement = 0
    for(i in 0..arr.size-1){
        if(arr[i] > maxElement){
            maxElement = arr[i]
        }
    }
    println("Max Element is $maxElement")
}