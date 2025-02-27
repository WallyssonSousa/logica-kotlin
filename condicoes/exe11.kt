fun main(){
    println("Digite duas notas de um aluno: ")
    val n1 = readln().toDouble()
    val n2 = readln().toDouble()

    val mediaFinal = (n1 + n2) / 2

    if(mediaFinal <= 4.9){
        println("Reprovado! Media final: $mediaFinal")
    } else if (mediaFinal in 5.0..6.9){
        println("Recuperação! Media final: $mediaFinal")
    } else {
        println("Aprovado! Media final: $mediaFinal")
    }
}