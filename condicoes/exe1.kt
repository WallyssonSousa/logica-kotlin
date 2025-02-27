fun main() {
    print("Qual a velocidade que seu carro estava andando? ")
    val velocidadeCarro = readln()!!.toDouble()
    val valorMultaPorKm = 5.0

    if (velocidadeCarro > 80.0) {
        val multa = (velocidadeCarro - 80) * valorMultaPorKm
        println("Você foi multado! O valor da multa é R$ $multa")
    } else {
        println("Você está dentro do limite de velocidade. Sem multa!")
    }
}