package com.github.pedrobacchini.bytebank.teste

import com.github.pedrobacchini.bytebank.modelo.Endereco
import java.lang.IllegalStateException

fun testaNullable() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Avenida Sao Paulo", complemento = "Farmacia")
    println(enderecoNulo?.logradouro?.length)
    enderecoNulo?.let {
        println(it.logradouro.length)
        val caracteresComplemento = it.complemento?.length ?: throw IllegalStateException("Sem complemento")
        println(caracteresComplemento)
    }
    teste(1)
    teste("")
}

fun teste(valor: Any) {
    val number: Int? = valor as? Int
    println(number)
}
