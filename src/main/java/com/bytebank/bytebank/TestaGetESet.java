package com.bytebank.bytebank;

public class TestaGetESet {

    public static void main(String[] args) {

        Conta conta = new Conta(0,0);

        conta.setNumero(123);
        System.out.println(conta.getNumero());

    }

}
