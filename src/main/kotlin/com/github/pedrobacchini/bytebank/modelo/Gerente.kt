package com.github.pedrobacchini.bytebank.modelo

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    private val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

    override val bonificacao: Double
        get() = salario * 0.1 + salario

    override fun authentica(senha: Int): Boolean {
        return this.senha == senha
    }
}