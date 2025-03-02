import kotlin.random.Random

fun main() {
    val numeroSorteado = Random.nextInt(1, 6)

    println("Bem-vindo ao jogo! Eu sortearei um número entre 1 e 5. Tente adivinhar!")

    var tentativa: Int
    do {
        print("Digite seu palpite (entre 1 e 5): ")
        tentativa = readln().toInt()

        when {
            tentativa < numeroSorteado -> println("O número sorteado é maior. Tente novamente.")
            tentativa > numeroSorteado -> println("O número sorteado é menor. Tente novamente.")
            else -> println("Parabéns! Você acertou o número sorteado: $numeroSorteado")
        }
    } while (tentativa != numeroSorteado) 
}
