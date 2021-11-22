import com.github.pedrobacchini.bytebank.modelo.Cliente
import com.github.pedrobacchini.bytebank.modelo.Diretor
import com.github.pedrobacchini.bytebank.modelo.Gerente
import com.github.pedrobacchini.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111.11",
        salario = 1000.0,
        senha = 123
    )

    val diretora = Diretor(
        nome = "Fran",
        cpf = "222.222.222.22",
        salario = 2000.0,
        senha = 456,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "333.333.333-33",
        senha = 789
    )

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 123)
    sistemaInterno.entra(diretora, 123)
    sistemaInterno.entra(cliente, 789)
}

