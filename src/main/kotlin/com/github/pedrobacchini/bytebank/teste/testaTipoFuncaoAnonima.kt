package com.github.pedrobacchini.bytebank.teste

fun testaTipoFuncaoAnonima() {
    val minhaFuncaoAnonima = fun() {
        println("Executa como anonima")
    }
    println(minhaFuncaoAnonima())
    val soma = fun(a: Int, b: Int) = a + b
    println(soma(10, 15))
    val calculadoraBonificacao: (salario: Double) -> Double = fun(salario: Double): Double {
        if (salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.0
    }
    println(calculadoraBonificacao(1100.0))
}