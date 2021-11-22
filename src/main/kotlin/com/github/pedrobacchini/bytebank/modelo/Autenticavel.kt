package com.github.pedrobacchini.bytebank.modelo

interface Autenticavel {

    fun authentica(senha: Int): Boolean
}