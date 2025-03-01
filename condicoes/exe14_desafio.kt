fun main() {
    print("Digite o comprimento do primeiro segmento: ")
    val a = readLine()!!.toDouble()
    print("Digite o comprimento do segundo segmento: ")
    val b = readLine()!!.toDouble()
    print("Digite o comprimento do terceiro segmento: ")
    val c = readLine()!!.toDouble()

    
    if (a + b > c && a + c > b && b + c > a) {
        
        if (a == b && b == c) {
            println("É um Triângulo Equilátero")
        } else if (a == b || b == c || a == c) {
            println("É um Triângulo Isósceles")
        } else {
            println("É um Triângulo Escaleno")
        }
    } else {
        println("Não é possível formar um triângulo!")
    }
}
