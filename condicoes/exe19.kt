fun main() {

    println("Digite o tipo de carro (popular ou luxo):")
    val tipoCarro = readLine()

    println("Digite o número de dias de aluguel:")
    val dias = readLine()!!.toInt()

    println("Digite o número de Km percorridos:")
    val km = readLine()!!.toInt()

    var valorAluguel = 0.0
    var valorKm = 0.0

    if (tipoCarro == "popular") {

        valorAluguel = 90.0 * dias
        if (km <= 100) {
            valorKm = km * 0.20
        } else {
            valorKm = km * 0.10
        }
    } else if (tipoCarro == "luxo") {
        valorAluguel = 150.0 * dias
        if (km <= 200) {
            valorKm = km * 0.30
        } else {
            valorKm = km * 0.25
        }
    } else {
        println("Tipo de carro inválido!")
        return
    }

    val total = valorAluguel + valorKm
    println("O valor total a ser pago é: R$ ${"%.2f".format(total)}")
}
