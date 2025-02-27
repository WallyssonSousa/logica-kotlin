fun main() {
    print("Digite um ano para saber se ele é bissexto ou não: ")
    val ano = readln()!!.toInt()

    if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
        println("É bissexto")
    } else {
        println("Não é bissexto")
    }
}