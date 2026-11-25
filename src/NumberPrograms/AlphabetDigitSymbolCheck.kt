package NumberPrograms

class AlphabetDigitSymbolCheck {
}
fun main(){
    println("Enter the Character: ")
    var ch: Char = readln()[0]
    var cha: Char = ch.lowercaseChar()
    println(cha)
    when(cha) {
        in 'a'..'z'  -> println("Alphabet")
        in '0'..'9' -> println("Digit")
        else -> println("Symbol")
    }

}