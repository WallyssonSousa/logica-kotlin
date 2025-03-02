fun main() {
    print("Jogador 1, escolha Pedra, Papel ou Tesoura: ")
    val jogador1 = readln().trim().capitalize() 
    print("Jogador 2, escolha Pedra, Papel ou Tesoura: ")
    val jogador2 = readln().trim().capitalize()

   
    val resultado = when {
        jogador1 == jogador2 -> "Empataram!"
        jogador1 == "Pedra" && jogador2 == "Tesoura" ||
                jogador1 == "Papel" && jogador2 == "Pedra" ||
                jogador1 == "Tesoura" && jogador2 == "Papel" -> "Jogador 1 foi o vencedor!"
        else -> "Jogador 2 foi o vencedor!"
    }

    println("$jogador1 x $jogador2: $resultado")
}
