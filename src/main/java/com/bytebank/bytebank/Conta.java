package com.bytebank.bytebank;

class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private  Cliente titular;

    private void deposita(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    private boolean saca(double valor) {
        if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }

    private boolean transfere(double valor, Conta destino) {
        if(this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    private double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
