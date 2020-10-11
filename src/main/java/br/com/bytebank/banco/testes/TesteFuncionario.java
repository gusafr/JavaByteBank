package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Gerente;

public class TesteFuncionario {

    public static void main(String[] args) {
        Gerente gustavo = new Gerente();
        gustavo.setNome("Gustavo Freitas");
        gustavo.setCpf("353.812.158.35");
        gustavo.setSalario(2590.80);

        System.out.println(gustavo.getNome());
        System.out.println(gustavo.getBonificacao());

    }

}
