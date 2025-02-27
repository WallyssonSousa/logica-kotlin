fun main() {
    print("Digite um valor: ")
    val n1 = readLine()!!.toInt()  // Converte a entrada para inteiro
    print("Digite outro valor: ")
    val n2 = readLine()!!.toInt()  // Converte a entrada para inteiro
    val resultado = n1 + n2

    println("A soma entre $n1 e $n2 é igual a $resultado")
}
