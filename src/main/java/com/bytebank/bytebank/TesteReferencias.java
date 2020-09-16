package com.bytebank.bytebank;

public class TesteReferencias {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Gustavo");
        g1.setSalario(5000.00);

        Gerente f1 = new Gerente();
        f1.setSalario(2000.00);


        ControleBonificacao controle = new ControleBonificacao();
        controle.registro(g1);
        controle.registro(f1);

        System.out.println(controle.getSoma());

    }

}
