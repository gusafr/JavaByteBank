package com.bytebank.bytebank.funcionarios;

import com.bytebank.bytebank.funcionarios.Funcionario;

public class ControleBonificacao {

    private double soma;

    public void registro(Funcionario f) {
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma() {
        return soma;
    }
}
