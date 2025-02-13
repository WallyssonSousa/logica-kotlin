fun main(){
    println("Digite um distância em metros: ")
    val metros = readln()?.toDoubleOrNull()

    if (metros != null) {
       val centimetros = metros * 100
        val milimetros = metros * 1000
        val quilometros = metros / 1000


        println("Distância em centimetros: $centimetros")
        println("Distância em milimetros: $milimetros")
        println("Distância em quilometros: $quilometros")
} else {
        println("Entrada não é válida")
    }
}