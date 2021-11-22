package com.github.pedrobacchini.bytebank.teste

import com.github.pedrobacchini.bytebank.modelo.Autenticavel
import com.github.pedrobacchini.bytebank.modelo.Conta
import com.github.pedrobacchini.bytebank.modelo.SistemaInterno

fun testaObjects() {
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun authentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 123)

    println(fran.cpf)

    println("Total de contas: ${Conta.total}")
}