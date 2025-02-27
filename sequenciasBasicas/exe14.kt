fun main(){
    print("Digite a quantidade KM rodados: ")
    val kmRodados = readln()!!.toDouble()
    print("Digite a quantidade de dias que ficou com o carro: ")
    val dias = readln()!!.toInt()
    println("Você ficou $dias dias com o carro, e rodou $kmRodados km então terá que" +
            " pagar ${(90 * dias) + (0.20 * kmRodados)}")
}