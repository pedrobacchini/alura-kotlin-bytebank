package com.github.pedrobacchini.bytebank.modelo

import com.github.pedrobacchini.bytebank.exception.FalhaAutenticacaoException
import com.github.pedrobacchini.bytebank.exception.SaldoInsuficienteException

abstract class ContaTransferivel(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor)
            throw SaldoInsuficienteException(
                "O saldo é insuficiente, saldo atual: $saldo, valor a ser substraido: $valor"
            )
        if (!authentica(senha))
            throw FalhaAutenticacaoException()

        saldo -= valor
        destino.deposita(valor)
    }
}