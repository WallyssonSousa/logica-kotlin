fun main(){
    print("Digite um número para descobrir se ele é impar ou par: ")
    val n = readLine()!!.toInt()
    if ( n % 2 == 0 ){
        println("O número $n é PAR!")
    } else {
        println("O número $n é IMPAR! ")
    }
}