package com.github.pedrobacchini.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    val endereco: Endereco = Endereco(),
    private val senha: Int
) : Autenticavel {
    override fun authentica(senha: Int): Boolean {
        return this.senha == senha
    }

    override fun toString(): String {
        return "Cliente(nome='$nome', cpf='$cpf', endereco=$endereco, senha=$senha)"
    }
}