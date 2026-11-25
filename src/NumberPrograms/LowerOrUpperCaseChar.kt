package NumberPrograms

class LowerOrUpperCaseChar {
}
fun main(){
    println("Enter Character: ")
    var ch: Char = readln().toCharArray()[0]
    println(ch)

    when(ch){
        in 'a' .. 'z' -> println("Lower Case Char")
        in 'A'..'Z' -> println("Upper Case Char")
        else -> println("Unknown")
    }

}