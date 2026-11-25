package NumberPrograms

class VowelConsonents {
}
fun main(){
    println("Enter the Character")
    var ch: Char = readln()[0]
    var cha:Char = ch.lowercaseChar()
    println(cha)

    if(cha in 'a'..'z'){
        if(cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u')
            println("Vowel")
        else
            println("Consonent")
    }else{
        println("InValid Character")
    }
}