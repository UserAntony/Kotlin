import Cadastro.*

fun main (){
    println("     ** WELCOME TO THE SHOP ***     ")
    println()

    val fogos = Aglomerados()
    fogos.Fabrica()
    println()

    val quantidade= Funcionario()
    quantidade.Empregar()
    println()

    val minhaInstancia = Empresa()
    minhaInstancia.Cadastrar()
    println()

    val minhaSenha = SenhaEmpresarial()
    minhaSenha.Verificacao()
    println()

    val estatistica = CNPJ()
    estatistica.Registrar()
    println()

    println("                  Agradecemos por Usar o nosso Aplicativo," +
            "volte sempre :)")
    }