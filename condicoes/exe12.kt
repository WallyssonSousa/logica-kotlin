fun main() {
    print("Digite o tamanho da largura: ")
    val largura = readln()!!.toDouble()
    print("Digite o tamanho do comprimento: ")
    val comprimento = readln()!!.toDouble()

    val area = comprimento * largura

    if (area < 100) {
        println("Terreno popular")
    } else if (area in 100.0..500.0) {
        println("Terreno master")
    } else {
        println("Terreno VIP")
    }


    println("A área do terreno é: $area m²")
}
