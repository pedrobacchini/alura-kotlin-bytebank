package com.github.pedrobacchini.bytebank.teste

import com.github.pedrobacchini.bytebank.modelo.Endereco

fun testaAny() {
    val endereco = Endereco(
        bairro = "Jardins",
        cep = "00000-000"
    )
    val enderecoNovo = Endereco(
        logradouro = "Avenida Brasil",
        cep = "00000-000"
    )
    println(endereco == enderecoNovo)
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco)
    println(enderecoNovo)

    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")
}

fun imprimir(valor: Any?): Any? {
    println(valor)
    return valor
}