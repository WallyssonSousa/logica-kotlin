fun main(){
    print("Digite o comprimento do primeiro segmento: ")
    val a = readLine()!!.toDouble()
    print("Digite o comprimento do segundo segmento: ")
    val b = readLine()!!.toDouble()
    print("Digite o comprimento do terceiro segmento: ")
    val c = readLine()!!.toDouble()

    if(a + b > c && a + c > b && b + c > a){
        println("É possível formar um triângulo! ")
    } else {
        println("Não é possível formar um triângulo!")
    }
}