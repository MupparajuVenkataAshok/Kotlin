package ExceptionHandling

class CustomException {
}
class NotEligibleToVote(message: String):Exception(message)

fun main(){
    //eligibleForVote(16)
    val name = "Venkat"
    val name2 = "Venkat"
    if(name === name2) println("Names are equal")
    else println("Names are not equal")
}
fun eligibleForVote(age:Int){
    try {
        if(age < 18)
            throw NotEligibleToVote("Age Should be Greater than 18")
        else
            println("Eligible To vote $age")
    }catch (e:Exception){
        println(e.message)
    }
}