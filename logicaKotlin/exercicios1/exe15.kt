fun main(){
    print("Digite a quantidade de dias trabalhos: ")
    val diasTrabalhados = readln()!!.toInt()
    val horasTrabalhadasPorDia = 8.0
    val valorHoraTrabalhada = 25.0

    println("Seu salário é de ${diasTrabalhados * (horasTrabalhadasPorDia * valorHoraTrabalhada)}")
}