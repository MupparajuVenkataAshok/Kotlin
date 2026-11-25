package NumberPrograms

class LeapYear {
}
fun main(){
    println("Enter Year")
    val year = readln().toInt()
    /*A year is a leap year if:
        It is divisible by 4.
        It is NOT divisible by 100, OR it IS divisible by 400.*/
    if((year%4 == 0) && (year%100 !=0 || year%400 == 0))
        println("Leap Year")
    else
        println("Not a Leap Year")
}