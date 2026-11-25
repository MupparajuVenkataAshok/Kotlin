//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val list = listOf(1,2,3,4,5)
    for(i in 0..list.size-1){
        println(list[i])
    }
    list.forEach{
        it -> println(it)
    }
}