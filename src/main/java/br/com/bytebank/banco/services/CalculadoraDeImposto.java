package br.com.bytebank.banco.services;

public class CalculadoraDeImposto {

    private double totalImposto;

    public void registro(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
