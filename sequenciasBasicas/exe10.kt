fun main(){
    print("Escreva a largura de uma parede: ")
    val largura = readln()!!.toDouble()
    print("Escreva a altura de uma parede: ")
    val altura = readln()!!.toDouble()

    val area = largura * altura

    val tintaNecessaria = area / 2

    println("Tamanho da área: $area")
    println("Tinta necessária: $tintaNecessaria")
}