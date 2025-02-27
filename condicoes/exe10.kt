fun main(){
    println("Digite dois números abaixo, para saber qual o maior entre os dois: ")
    val n1 = readln()!!.toInt()
    val n2 = readln()!!.toInt()

    if(n1 > n2){
        println("O primeiro valor é o maior")
    } else if (n2 > n1){
        println("O segundo valor é o maior")
    } else {
        println("Não existe um valor maior, os dois são iguais")
    }
}