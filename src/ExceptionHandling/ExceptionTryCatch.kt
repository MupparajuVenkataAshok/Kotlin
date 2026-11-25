package ExceptionHandling

class ExceptionTryCatch {
}
fun main(){
    divide(0)
}
fun divide(a: Int): Int {
    try {
        val result = 10 / a
        println("Try Block Executed: ")
        return result
    }catch (e: ArithmeticException){
        println("Catch Block Executed: ")
        return 0
    }finally {
        println("Finally Block Block Executed: ")
    }
}