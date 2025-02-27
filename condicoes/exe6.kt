import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

fun main() {
    print("Digite a data do seu nascimento no formato dd/MM/yyyy, para saber sua situação no alistamento militar: ")

    val dataNascimento = readLine()

    val formato = DateTimeFormatter.ofPattern("dd/MM/yyyy")

    try {

        if (dataNascimento != null) {
            val dataNascimentoFormatada = LocalDate.parse(dataNascimento, formato)
            val dataAtual = LocalDate.now()
            val idade = Period.between(dataNascimentoFormatada, dataAtual).years
            val idadeAlistamento = 18

            if (idade < idadeAlistamento) {
                println("Você ainda não precisa se alistar! Faltam ${idadeAlistamento - idade} anos para você se alistar.")
            } else {
                println("Já se passaram ${idade - idadeAlistamento} anos desde o seu alistamento militar obrigatório.")
            }
        } else {
            println("A data inserida é inválida.")
        }
    } catch (e: Exception) {
        println("Data inválida! Certifique-se de usar o formato dd/MM/yyyy.")
    }
}