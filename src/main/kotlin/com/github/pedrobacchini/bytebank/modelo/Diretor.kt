package com.github.pedrobacchini.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    private val senha: Int,
    val plr: Double
) : Funcionario(
    nome,
    cpf,
    salario
), Autenticavel {

    override val bonificacao: Double
        get() = salario * 0.1 + salario + plr

    override fun authentica(senha: Int): Boolean {
        return this.senha == senha
    }

    override fun toString(): String {
        return "com.github.pedrobacchini.bytebank.modelo.Diretor(nome='$nome', cpf='$cpf', salario=$salario, plr=$plr, bonificacao=$bonificacao)"
    }
}