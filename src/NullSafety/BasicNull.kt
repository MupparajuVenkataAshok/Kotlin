package NullSafety

class BasicNull {
}
fun main(){
    var age: Int = 20
    //age = null
    //Null cannot be a value of a non-null type 'Int'.

    //To allow null values, declare a variable with a ? sign right after the variable type.
    var name: String?= "ASHOK"
    //if the value is assigned, it will print the value
    //otherwise it will print the null.
    println(name)
    //When you use safecall operator(!!.), you’re telling the compiler, “I know this value won’t be null, just treat it like it’s safe.” If you’re wrong, it crashes as NullPointerException.
    //When you apply the !! operator to a variable whose value is not null, it's safely handled as a non-nullable type, and the code executes normally. However, if the value is null, the !! operator forces it to be treated as non-nullable, which results in an NPE.
    println(name!!.length)
    //?. elvis operartor :- When working with nullable types, you can check for null and provide an alternative value.
    // If the expression to the left of ?: is not null, the Elvis operator returns it. Otherwise, the Elvis operator returns the expression to the right. The expression on the right-hand side is evaluated only if the left-hand side is null.
    println("Enter the price : ")
    val price: Double?= readln().toDoubleOrNull()
    println(price)

}