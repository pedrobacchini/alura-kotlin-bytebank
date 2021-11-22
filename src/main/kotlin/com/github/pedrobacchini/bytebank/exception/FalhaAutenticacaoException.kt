package com.github.pedrobacchini.bytebank.exception

class FalhaAutenticacaoException(
    mensagem: String = "Falha de autenticacao"
) : Exception(mensagem)