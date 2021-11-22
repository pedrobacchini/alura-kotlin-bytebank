package com.github.pedrobacchini.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }

    override fun toString(): String {
        return "com.github.pedrobacchini.bytebank.modelo.CalculadoraBonificacao(total=$total)"
    }


}