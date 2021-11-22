import com.github.pedrobacchini.bytebank.exception.FalhaAutenticacaoException
import com.github.pedrobacchini.bytebank.exception.SaldoInsuficienteException
import com.github.pedrobacchini.bytebank.modelo.Cliente
import com.github.pedrobacchini.bytebank.modelo.ContaCorrente
import com.github.pedrobacchini.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val alex = Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1)
    val contaAlex = ContaPoupanca(titular = alex, numeroConta = 10002)
    val fran = Cliente(nome = "Fran", cpf = "222.222.222-22", senha = 2)
    val contaFran = ContaCorrente(titular = fran, numeroConta = 10001)

    println("titular ${contaFran.titular}")
    println("numero da conta ${contaFran.numeroConta}")
    println("saldo da conta ${contaFran.saldo}")
    println()

    println("titular ${contaAlex.titular}")
    println("numero da conta ${contaAlex.numeroConta}")
    println("saldo da conta ${contaAlex.saldo}")
    println()

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println("Valor na conta ${contaAlex.saldo}")
    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println("Valor na conta ${contaFran.saldo}")
    println()

    println("sacando na conta do Alex")
    contaAlex.saca(20.0)
    println(contaAlex.saldo)
    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)
    println()

    println("transferindo 20 do Alex para a Fran")
    try {
        contaAlex.transfere(20.0, contaFran, 1)
        println("Transferencia realizada com sucesso")
    } catch (e: Exception) {
        println("Transferencia falhou")
        when (e) {
            is SaldoInsuficienteException -> println("Saldo insuficiente")
            is FalhaAutenticacaoException -> println("Falha de autenticacao")
            else -> println("Erro desconhecido")
        }
        e.printStackTrace()
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}