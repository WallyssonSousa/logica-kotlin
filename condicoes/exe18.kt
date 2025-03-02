// Desafio do IMC Condições Compostas

fun main() {
    print("Digite sua altura (em metros): ")
    val altura = readln()!!.toDouble()
    print("Digite seu peso (em kg): ")
    val peso = readln()!!.toDouble()
    val imc = peso / (altura * altura)

    
    if (imc < 18.5) {
        println("Abaixo do peso")
    } else if (imc >= 18.5 && imc < 25) {
        println("Peso ideal")
    } else if (imc >= 25 && imc < 30) {
        println("Sobrepeso")
    } else if (imc >= 30 && imc < 40) {
        println("Obesidade")
    } else {
        println("Obesidade mórbida")
    }
}
