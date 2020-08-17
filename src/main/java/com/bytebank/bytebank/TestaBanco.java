package com.bytebank.bytebank;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente gustavo = new Cliente();
        gustavo.nome = "Gustavo Freitas";
        gustavo.cpf = "353.812.158-35";
        gustavo.profissao = "Desenvolvedor";

        Conta contaDoGustavo = new Conta();
        contaDoGustavo.deposita(100);

        contaDoGustavo.titular = gustavo;

        System.out.println(contaDoGustavo.titular.nome);

    }
}
