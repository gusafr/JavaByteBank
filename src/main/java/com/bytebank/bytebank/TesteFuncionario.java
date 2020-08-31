package com.bytebank.bytebank;

public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario gustavo = new Funcionario();
        gustavo.setNome("Gustavo Freitas");
        gustavo.setCpf("353.812.158.35");
        gustavo.setSalario(2590.80);

        System.out.println(gustavo.getNome());
        System.out.println(gustavo.getBonificacao());

    }

}
