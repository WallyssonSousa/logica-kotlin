fun main(){
    print("Quantos cigarros você fuma por dia ? ")
    val cigarrosFumadosPorDia = readLine()!!.toInt()

    print("Quantos anos você já fumou ? ")
    val anosFumados = readLine()!!.toInt()

    val minutosPorCigarro = 10
    val minutosPorDia = 24 * 60


    val minutosPerdidosPorDia = cigarrosFumadosPorDia * minutosPorCigarro


    val totalMinutosPerdidos = minutosPerdidosPorDia * anosFumados * 365


    val diasPerdidos = totalMinutosPerdidos / minutosPorDia


    println("Você perdeu aproximadamente $diasPerdidos dias de vida devido ao hábito de fumar.")
}