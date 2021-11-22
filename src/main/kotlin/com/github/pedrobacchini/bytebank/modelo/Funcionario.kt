package com.github.pedrobacchini.bytebank.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    abstract val bonificacao: Double

    override fun toString(): String {
        return "com.github.pedrobacchini.bytebank.modelo.Funcionario(nome='$nome', cpf='$cpf', salario=$salario, bonificacao=$bonificacao)"
    }
}