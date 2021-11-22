package com.github.pedrobacchini.bytebank.teste

fun testaOverloadingInvoke() {
    val overloadingInvoke1 = OverloadingInvoke()
    println(overloadingInvoke1())
    val overloadingInvoke2 = OverloadingInvoke()
    println(overloadingInvoke2(1))
    val over: () -> Unit = OverloadingInvoke()
    println(over())
}

class OverloadingInvoke : () -> Unit {

    operator fun invoke(valor: Int) {
        println(valor)
    }

    override operator fun invoke() {
        println("executa invoke do Teste")
    }
}