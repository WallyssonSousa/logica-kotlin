fun main(){
    print("Qual o seu nome: ")
    val nome = readln()
    print("Qual o seu sexo: ")
    val sexo = readln()
    print("Qual o valor final das suas compras: ")
    val valorFinalCompras = readln()!!.toDouble()

    val valorDescontoHomem = valorFinalCompras * 0.5
    val valorDescontoMulher = valorFinalCompras * 0.13

    if(sexo == "Mulher"){
        println("Olá $nome, o valor final da sua compra com desconto ficou: $valorDescontoMulher")
    } else if (sexo == "Homem") {
        println("Olá $nome, o valor final da sua compra com desconto ficou: $valorDescontoHomem")
    } else {
        print("Sexo não identificado! Digite apenas homem ou mulher. ")
    }
}