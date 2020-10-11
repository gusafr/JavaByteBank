package com.bytebank.bytebank.testes;

import com.bytebank.bytebank.contas.Conta;
import com.bytebank.bytebank.contas.ContaCorrente;
import com.bytebank.bytebank.Excecoes.SaldoInsuficienteException;

public class TesteSaca {

    public static void main(String[] args) throws SaldoInsuficienteException {
        Conta conta = new ContaCorrente(123, 321);

        try {
            conta.saca(210.00);
        } catch (Exception ex) {
            String msg = ex.getMessage();
            System.out.println("Problema: " + msg);
            ex.printStackTrace();
        }

        System.out.println(conta.getSaldo());
    }

}
