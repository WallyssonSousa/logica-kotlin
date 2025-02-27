fun main(){
    println("Digite um número: ")
    val n = readLine()!!.toDouble()
    val tercaParte = n / 3
    println("O dobro de $n é ${n * 2}")
    println("A terça parte de $n é ${tercaParte / 3 }")
}