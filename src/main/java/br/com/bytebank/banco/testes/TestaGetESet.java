package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaGetESet {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        cliente1.setNome("Gustavo Almeida Freitas");
        System.out.println("Definido nome para a conta 1: " + cliente1.getNome());

        Conta conta = new ContaCorrente(0,0);

        conta.setNumero(123);
        System.out.println(conta.getNumero());

    }

}
