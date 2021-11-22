import com.github.pedrobacchini.bytebank.modelo.*

fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println(alex.toString())

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-11",
        salario = 2000.0,
        senha = 123
    )

    println(fran.toString())

    if (fran.authentica(123)) {
        println("Autenticado com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println(gui.toString())

    if (gui.authentica(123)) {
        println("Autenticado com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 3000.0
    )

    println(maria.toString())

    val paulo = Auxiliar(
        nome = "Paulo",
        cpf = "555.555.555-55",
        salario = 1000.0
    )

    println(paulo.toString())

    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registra(alex)
    calculadoraBonificacao.registra(fran)
    calculadoraBonificacao.registra(gui)
    calculadoraBonificacao.registra(maria)
    calculadoraBonificacao.registra(paulo)

    println(calculadoraBonificacao.toString())
}