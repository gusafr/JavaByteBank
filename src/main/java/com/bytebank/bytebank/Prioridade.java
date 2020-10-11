package com.bytebank.bytebank;

public enum Prioridade {

    MIN(1),NORMAL(5),MAX(10);

    private int valor;

    Prioridade(int valor) {
        this.valor = valor;
    }

}
