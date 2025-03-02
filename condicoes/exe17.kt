fun main() {

    print("Digite o valor da casa: R$")
    val valorCasa = readLine()!!.toDouble()

    print("Digite o salário do comprador: R$")
    val salario = readLine()!!.toDouble()

    print("Digite o número de anos para pagar: ")
    val anosParaPagar = readLine()!!.toInt()

    val numeroParcelas = anosParaPagar * 12

    val prestacaoMensal = valorCasa / numeroParcelas
    
    if (prestacaoMensal <= salario * 0.30) {
        println("Empréstimo aprovado! A prestação mensal será de R$ ${"%.2f".format(prestacaoMensal)}")
    } else {
        println("Empréstimo negado! A prestação mensal excede 30% do salário.")
    }
}
