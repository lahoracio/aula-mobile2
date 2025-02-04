import java.time.LocalDate
import java.time.Period
import kotlin.math.pow

class Paciente {

    //DEFININDO ATRIBUTOS

    var nome: String = ""
    var datanascimento: LocalDate? = null

    //interrogacao (?) esta ciente que é preciso usar

    var peso: Int = 0
    var altura: Float = 0.0f

    //Double ou Float significa numero flutuante ex. decimal
    //f é pra dizer que é um numero flutuante tipo Float

    var telefone: String = ""

    //CRIANDO FUNCOES/O QUE DEVE FAZER
    //dois pontos usa para retornar algo

    fun calcularImc(): Float{
        //pow é pra ser elevado a potencia ex.2
        var imc = peso / altura.pow(2)
        return imc
    }


    fun mostrarDados() {
        println("DADOS DO PACIENTE")
        println("-------------------")
        println("NOME: $nome")
        println("IDADE: ${calcularIdade()}")
        println("PESO: $peso")
        println("ALTURA: $altura")
        println("IMC: ${calcularImc()}")
        println("CLASSIFICAÇÃO: ${classificarImc()}")
        println("--------------------")
    }

    fun classificarImc(): String{
        val imc = calcularImc()
        var classificacao = ""

        if (imc <= 18.5){
            classificacao = "Abaixo do peso"
        } else if (imc > 18.5 && imc < 25.0){
            classificacao = "Peso Ideal"
        }else {
            classificacao = "Acima do peso"
        }

        return classificacao
    }
    //val é constante, ou seja sempre

    fun calcularIdade(): Int{
        val hoje = LocalDate.now()
        val idade = Period.between(datanascimento, hoje).years
        return idade
    }
}