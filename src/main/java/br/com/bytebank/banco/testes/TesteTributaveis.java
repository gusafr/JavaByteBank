package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.services.CalculadoraDeImposto;
import br.com.bytebank.banco.services.SeguroDeVida;

public class TesteTributaveis {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadoraDeImposto calc = new CalculadoraDeImposto();
        calc.registro(cc);
        calc.registro(seguro);

        System.out.println(calc.getTotalImposto());

    }

}
