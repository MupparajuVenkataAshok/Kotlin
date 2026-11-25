data class DataClass(
    val id: String?= null,
    val name: String?= null,
    val price: Int?= null,
)
fun main(){
    val product1 = DataClass("1","laptop",2000)
    //without data class it will print the address of an object because toString() was not override in normal class
    println(product1)
    println(product1.hashCode())
}
