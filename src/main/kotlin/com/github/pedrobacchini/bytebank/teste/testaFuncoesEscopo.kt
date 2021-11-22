package com.github.pedrobacchini.bytebank.teste

import com.github.pedrobacchini.bytebank.modelo.Endereco

fun testaFuncoesEscopo() {
    run {
        println("execução do run sem extensão")
    }

    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
    val enderecosEmMaisculo = "${endereco.logradouro} ${endereco.numero}".uppercase()
    println(enderecosEmMaisculo)

    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .run { "$logradouro $numero".uppercase() }
        .let { enderecosM: String ->
            println(enderecosM)
        }

    with(Endereco(logradouro = "rua vergueiro", numero = 3185)) {
        "$logradouro $numero".uppercase()
    }.let { enderecosM: String ->
        println(enderecosM)
    }

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter { it.complemento != null }
        .let(::println)

    val numberList = mutableListOf(5.0)
    numberList.also { println("Populating the list") }
        .apply {
            add(2.71)
            add(3.14)
            add(1.0)
            this[0] = 1.0
        }
        .also { println("Couting") }
        .apply { println(this.size) }
        .apply { println(this[0]) }
        .also { println("Sorting the list") }
        .sort()
}