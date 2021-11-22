package com.github.pedrobacchini.bytebank.teste

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClass: () -> Unit = PrintTest()
    println(minhaFuncaoClass())
    val soma = Soma()
    println(soma(1, 2))
}

class Soma : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int = p1 + p2
}

class PrintTest : () -> Unit {
    override fun invoke() = println("funcao teste de classe")
}
