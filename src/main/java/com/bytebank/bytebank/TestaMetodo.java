package com.bytebank.bytebank;

public class TestaMetodo {
    public static void main(String[] args) {

        Conta contaDoGustavo = new Conta();
        contaDoGustavo.saldo = 100;
        contaDoGustavo.deposita(50);
        System.out.println("Saldo da conta Gustavo é: " + contaDoGustavo.saldo);

        contaDoGustavo.saca(20);
        boolean conseguiuRetirar = contaDoGustavo.saca(20);
        System.out.println("Saldo após saque da conta Gustavo é: " + contaDoGustavo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        System.out.println("Saldo da conta da Marcela é: " + contaDaMarcela.saldo);

        if(contaDaMarcela.transfere(3000, contaDoGustavo)) {
            System.out.println("Transferência realizada");
        } else {
            System.out.println("Faltou recursos para transfência");
        };
        System.out.println("Saldo conta da Marcela após transfência: " + contaDaMarcela.saldo);
        System.out.println("Saldo da conta do Gustavo após transfência: " + contaDoGustavo.saldo);

    }
}
