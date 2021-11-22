package com.github.pedrobacchini.bytebank.teste

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::printTest
    println(minhaFuncao())
    val minhaFuncaoComParametros = ::soma
    println(minhaFuncaoComParametros(1,2))
}

fun printTest() {
    println("funcao teste")
}

fun soma(a: Int, b: Int): Int = a + b