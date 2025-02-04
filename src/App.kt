import java.time.LocalDate
import java.util.Scanner


fun main() {

    val leitor = Scanner(System.`in`)

    var paciente1 = `Paciente.kt`()
    var paciente2 = `Paciente.kt`()


    print("Qual o nome do paciente: ")
    //nextline programa para e espera eu digitar o nome do paciente- ele se torna o paciente que voce quer
    paciente1.nome = leitor.nextLine()
    print ("Qual o peso do paciente: ")
    paciente1.peso = leitor.nextInt()
    paciente1.altura = 1.61f
    paciente1.telefone = "(11)980797-9089"
    paciente1.datanascimento = LocalDate.of(2003, 8, 13)

    paciente1.mostrarDados()

    paciente2.nome = "Lara Machado"
    paciente2.peso = 65
    paciente2.altura = 1.70f
    paciente2.telefone = "(11)987-6677"
    paciente2.datanascimento = LocalDate.of(2008,2,23)
    paciente2.mostrarDados()


}