fun main() {
    println("Digite o nome, salário e quantos anos de empresa tem o funcionário: ")
    val nome = readln()!!.toString()
    val salario = readln()!!.toDouble()
    val anosDeEmpresa = readln()!!.toInt()

    val aumentoTresAnos = salario * 0.03
    val aumentoMaisDeTresMenosDeDez = salario * 0.125
    val aumentoMaisDeDezAnos = salario * 0.20

    val novoSalarioTresAnos = salario + aumentoTresAnos
    val novoSalarioMaisDeTresMenosDeDez = salario + aumentoMaisDeTresMenosDeDez
    val novoSalarioMaisDeDezAnos = salario + aumentoMaisDeDezAnos

    if (anosDeEmpresa <= 3) {
        println("Novo salário do(a) $nome, que tem $anosDeEmpresa ano(s) de empresa: R$ ${"%.2f".format(novoSalarioTresAnos)}")
    } else if (anosDeEmpresa in 4..9) {
        println("Novo salário do(a) $nome, que tem $anosDeEmpresa anos(s) de empresa: R$ ${"%.2f".format(novoSalarioMaisDeTresMenosDeDez)}")
    } else {
        println("Novo salário do(a) $nome, que tem $anosDeEmpresa ano(s) de empresa: R$ ${"%.2f".format(novoSalarioMaisDeDezAnos)}")
    }
}
