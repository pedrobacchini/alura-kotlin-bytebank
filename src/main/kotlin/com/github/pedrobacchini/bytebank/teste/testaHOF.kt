package com.github.pedrobacchini.bytebank.teste

import com.github.pedrobacchini.bytebank.modelo.Autenticavel
import com.github.pedrobacchini.bytebank.modelo.SistemaInterno

fun testaHOF() {
    soma(1, 5, resultado = { valor ->
        println(valor)
    })
    somaReceiver(1, 5, resultado = {
        println(this)
    })

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun authentica(senha: Int) = this.senha == senha
    }
    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("Realizou a autenticação")
    })

    SistemaInterno().entraReceiver(autenticavel, 1234, autenticado = {
        pagamento()
    })
}

private fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")
}

private fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("antes da soma")
    val total = a + b
    total.resultado()
    println("depois da soma")
}