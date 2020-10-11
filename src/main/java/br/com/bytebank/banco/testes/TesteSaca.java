package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

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
