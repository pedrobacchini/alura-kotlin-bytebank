package com.github.pedrobacchini.bytebank

import com.github.pedrobacchini.bytebank.modelo.Cliente
import com.github.pedrobacchini.bytebank.modelo.ContaPoupanca
import com.github.pedrobacchini.bytebank.modelo.Endereco

fun main() {

}

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("taxa mensal $taxaMensal")

    val contaPoupanca = ContaPoupanca(
        titular =
        Cliente(
            nome = "Pedro",
            cpf = "027.170.491-85",
            senha = 1234
        ),
        numeroConta = 1000
    )
    contaPoupanca
        .run {
            deposita(1000.0)
            saldo * taxaMensal
        }.let { rendimentoMensal ->
            println("rendimento mensal $rendimentoMensal")
        }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) { saldo += saldo * taxaMensal }
        saldo
    }
    println("Simulação rendimento anual $rendimentoAnual")
}

fun testaWith() {
    with(Endereco()) {
        logradouro = "Avenida Dom Aquino"
        numero = 470
        bairro = "Parque Eldorado"
        cidade = "Primavera do Leste"
        estado = "MT"
        cep = "78850-000"
        complemento = "Sobrado"
        completo()
    }.let(::println)
}



