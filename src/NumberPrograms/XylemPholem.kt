package NumberPrograms

class XylemPholem {
}
fun main(){
    println("Enter number")
    var num = readln().toInt()

    var cornerSum = 0
    var middleDigitSum = 0

    //if two digits
    if(num < 100){
        println("Phloem Number")
        return
    }
    cornerSum = cornerSum + num%10
    num = num/10
    while(num > 9){
        middleDigitSum += num%10
        num /= 10
    }
    cornerSum = cornerSum + num%10
    if(cornerSum == middleDigitSum) println("Xyloem Number")
    else println("Phloem Number")
}