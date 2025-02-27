import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.Period

fun main() {

    print("Digite sua data de nascimento no formato dd/MM/yyyy: ")
    val dataNascimento = readln()


    val formato = DateTimeFormatter.ofPattern("dd/MM/yyyy")

    try {

        val dataNascimentoFormatada = LocalDate.parse(dataNascimento, formato)


        val dataAtual = LocalDate.now()


        val idade = Period.between(dataNascimentoFormatada, dataAtual).years


        if (idade >= 18) {
            println("Você tem $idade anos. Pode votar!")
        } else {
            println("Você tem $idade anos. Não pode votar.")
        }

    } catch (e: Exception) {
        println("Formato de data inválido! Por favor, insira a data no formato dd/MM/yyyy.")
    }
}