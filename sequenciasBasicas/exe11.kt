import kotlin.math.pow

fun main(){
    println("Digite os valores de a, b e c separados por espaço: ")
    val input = readln()!!.split(" ")

    val a = input[0].toInt()
    val b = input[1].toInt()
    val c = input[2].toInt()

    println("Valores: a = $a, b = $b, c = $c")

    val delta = (b.toDouble().pow(2)) - (4 * a * c)
    println("Delta = $delta")
}