fun main(){
    println("Digite um valor: ")
    val n = readLine()!!.toInt()
    val antecessor = n - 1
    val sucessor = n + 1
    println("O antecessor de $n é $antecessor")
    println("O sucessor de $n é $sucessor")
}