package com.github.pedrobacchini.bytebank.teste

fun testaExpressao() {
    val entrada = "1.9"
    val valor: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversao")
        e.printStackTrace()
        null
    }

    val taxa = when {
        valor != null -> valor + 0.1
        else -> null
    }
    if (taxa != null)
        println("valor recebido: $taxa")
    else
        println("taxa invalida")
}