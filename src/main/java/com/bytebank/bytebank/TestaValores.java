package com.bytebank.bytebank;

public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(10, 5000);

        conta.setAgencia(-50);
        conta.setNumero(-300);

        System.out.println(conta.getAgencia());
    }

}
