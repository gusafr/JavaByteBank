package br.com.bytebank.banco.services;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }

}
