package com.github.pedrobacchini.bytebank.teste

import com.github.pedrobacchini.bytebank.exception.SaldoInsuficienteException

fun funcao1() {
    println("inicio funcao 1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
        println("SaldoInsuficienteException foi pegada")
    }
    println("fim funcao 1")
}

fun funcao2() {
    println("inicio funcao 2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        throw SaldoInsuficienteException()
    }
    println("fim funcao 2")
}

