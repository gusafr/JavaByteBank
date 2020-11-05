package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        Conta[] contas = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(001,123);
        ContaCorrente cc2 = new ContaCorrente(001, 456);
        contas[0] = cc1;
        ContaCorrente refConta = (ContaCorrente) contas[0];

        //int[] refs = {1,2,3,4,5};

        ContaPoupanca cp1 = new ContaPoupanca(001, 222);
        ContaPoupanca cp2 = new ContaPoupanca(001, 333);
        contas[1] = cp1;
        ContaPoupanca refPoupanca = (ContaPoupanca) contas[1];

        System.out.println(contas[0].getNumero());
        System.out.println(contas[1].getNumero());

        System.out.println(refConta.getNumero());
        System.out.println(refPoupanca.getNumero());



    }

}
