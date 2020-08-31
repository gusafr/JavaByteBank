package com.bytebank.bytebank;

public class TestaGetESet {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        cliente1.setNome("Gustavo Almeida Freitas");
        System.out.println("Definido nome para a conta 1: " + cliente1.getNome());

        Conta conta = new Conta(0,0);

        conta.setNumero(123);
        System.out.println(conta.getNumero());

    }

}
