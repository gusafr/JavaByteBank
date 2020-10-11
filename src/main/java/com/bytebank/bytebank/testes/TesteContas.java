package com.bytebank.bytebank.testes;

import com.bytebank.bytebank.contas.ContaCorrente;
import com.bytebank.bytebank.contas.ContaPoupanca;
import com.bytebank.bytebank.Excecoes.SaldoInsuficienteException;

public class TesteContas {

    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(100.00);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200.00);

        cc.transfere(10.0, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " +cp.getSaldo());

    }

}
