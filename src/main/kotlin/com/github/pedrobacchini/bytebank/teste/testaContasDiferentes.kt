import com.github.pedrobacchini.bytebank.modelo.*

fun testaContasDiferentes() {
    val alex = Cliente(
        nome = "Alex",
        cpf = "111.111.111-11",
        senha = 1,
        endereco = Endereco(
            logradouro = "Rua Vergueiro"
        )
    )
    val contaCorrente = ContaCorrente(
        titular = alex,
        numeroConta = 1000
    )
    val fran = Cliente(nome = "Fran", cpf = "222.222.222-22", senha = 2)
    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numeroConta = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println(contaCorrente.toString())
    println(contaPoupanca.toString())
    println()

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Apos saque")
    println(contaCorrente.toString())
    println(contaPoupanca.toString())
    println()

    contaCorrente.transfere(100.0, contaPoupanca, 1)
    println("saldo corrente apos transferir para poupanca")
    println(contaCorrente.toString())
    println(contaPoupanca.toString())

    contaPoupanca.transfere(100.0, contaCorrente, 2)
    println("saldo poupanca apos transferir para corrente")
    println(contaCorrente.toString())
    println(contaPoupanca.toString())

    val contaSalario = ContaSalario(
        titular = Cliente(nome = "Pedro", cpf = "333.333.333-33", senha = 3),
        numeroConta = 1000
    )

//    contaSalario.transfere(100.0, contaCorrente)
}

