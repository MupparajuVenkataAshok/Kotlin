package ExceptionHandling

class ExceptionEx {
}
fun main(){
    makeCoffee()
}
fun makeCoffee() {
    try {
        println("Brewing coffee...")
        val waterTemp = 50
        if (waterTemp < 80) {
            throw Exception("Water not hot enough!")
        }
        println("Coffee is ready!")
    } catch (e: Exception) {
        println("Oops! ${e.message}")
    } finally {
        println("Cleaning the coffee machine.")
    }
}