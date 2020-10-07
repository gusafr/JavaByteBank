package com.bytebank.bytebank.contas;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }

}
