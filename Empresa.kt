package Cadastro

class Empresa {
    fun Cadastrar() {
        var Funcionario: String

            do {
                print("Digite o seu usuario")
                Funcionario = readLine()!!.toUpperCase()
            } while (Funcionario == null)
            println("$Funcionario")
        }
    }
class SenhaEmpresarial {

    fun Verificacao(){
        var Senha: Int
        do {
            println("Digite a sua senha")
            Senha= readLine()!!.toInt()
        } while (Senha < 6)
        println("$Senha")
    }
}
class Funcionario{
    fun Empregar(){
        print("Quantos funcionarios tem a sua empresa: ")
        var QuantidadedeFuncionario: Int = readLine()!!.toInt()

        if((QuantidadedeFuncionario < 350 ) || (QuantidadedeFuncionario <= 500)){
            println("Empresa de pequeno Porte")

        }else if (QuantidadedeFuncionario < 550 || (QuantidadedeFuncionario <= 800)) {
            println("Empresa de medio Porte")

        }else
            println("Empresa de grande Porte")

    }
}

class Aglomerados{
    fun Fabrica(){
        print("Digite o nome da sua  Empresa")
        var oficio:String = readLine()!!.toString()
        println()
        print("...\n\n")
        print("Tem certeza ? ")
        println()

        println("     YES   OR      NO    ")
        readLine()!!.toString()


    }
}

class CNPJ{
    fun Registrar(){
        print("Insira o seu CNPJ/CPF")
        var ficha: Int = readLine()!!.toInt()
        println()
        println("CNPJ cadastrado com sucesso. ")
    }
}