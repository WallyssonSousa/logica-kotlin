fun main() {
    print("Digite a distância que deseja percorrer em Km: ")
    val distancia = readLine()!!.toDouble()

    val preco: Double = if (distancia <= 200) {
        distancia * 0.50
    } else {
        distancia * 0.45
    }

    println("O preço da passagem para ${distancia}Km é: R$${"%.2f".format(preco)}")
}