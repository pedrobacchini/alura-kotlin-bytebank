package com.github.pedrobacchini.bytebank.teste

fun testaTipoFuncaoLambda() {
    val minhaFuncaoLambda = {
        println("Executa como lambda")
    }
    println(minhaFuncaoLambda())
    val soma: (Int, Int) -> Int = { a, b ->
        a + b
    }
    println(soma(10, 10))
    val calculadoraBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50.0
        }
        salario + 100.0
    }
    println(calculadoraBonificacao(1100.0))
}