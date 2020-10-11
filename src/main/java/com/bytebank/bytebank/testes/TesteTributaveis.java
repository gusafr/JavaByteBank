package com.bytebank.bytebank.testes;

import com.bytebank.bytebank.services.CalculadoraDeImposto;
import com.bytebank.bytebank.services.SeguroDeVida;
import com.bytebank.bytebank.contas.ContaCorrente;

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