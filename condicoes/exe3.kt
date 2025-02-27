fun main(){
    print("Digite seu nome: ")
    val nome = readln()
    println("Digite as duas notas do aluno (a): ")

    val n1 = readln().toDouble()
    val n2 = readln().toDouble()

    val media = (n1 + n2) / 2

    println("O aluno $nome tirou $n1 e $n2, e ficou com a seguinte média: $media")

    if (media >= 7){
        println("Este aluno foi aprovado.")
    } else {
        println("Este aluno foi reprovado.")
    }
}