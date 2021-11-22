package com.github.pedrobacchini.bytebank.modelo

class SistemaInterno {

    fun entra(autenticavel: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if (autenticavel.authentica(senha)) {
            println("Bem vindo ao Bytebank!")
            autenticado()
        } else {
            println("Falha na autenticação")
        }
    }

    fun entraReceiver(autenticavel: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}) {
        if (autenticavel.authentica(senha)) {
            println("Bem vindo ao Bytebank!")
            autenticado()
        } else {
            println("Falha na autenticação")
        }
    }

    fun pagamento() {
        println("Realizando pagamento")
    }
}