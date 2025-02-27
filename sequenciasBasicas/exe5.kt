fun main(){
    print("Digite um valor: ")
    val n1 = readLine()!!.toDouble()  // Converte a entrada para inteiro
    print("Digite outro valor: ")
    val n2 = readLine()!!.toDouble()
    val soma = n1 + n2
    val media = soma / 2.0  // Divisão por 2.0 para garantir precisão decimal
    println("A média de $n1 + $n2 é igual $media")
}
