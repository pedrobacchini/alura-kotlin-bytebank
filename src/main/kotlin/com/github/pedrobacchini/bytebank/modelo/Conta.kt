package com.github.pedrobacchini.bytebank.modelo

abstract class Conta(
    val titular: Cliente,
    val numeroConta: Int
) : Autenticavel by titular {
    var saldo: Double = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    fun deposita(valor: Double) {
        if (valor > 0) saldo += valor
    }

    open fun saca(valor: Double) {
        if (saldo >= valor) saldo -= valor
    }

    override fun toString(): String {
        return "Conta(titular=$titular, numeroConta=$numeroConta, saldo=$saldo)"
    }
}