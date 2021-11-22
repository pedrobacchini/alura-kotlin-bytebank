package com.github.pedrobacchini.bytebank.modelo

class ContaCorrente(
    titular: Cliente,
    numeroConta: Int
) : ContaTransferivel(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (saldo >= valorComTaxa) saldo -= valorComTaxa
    }
}