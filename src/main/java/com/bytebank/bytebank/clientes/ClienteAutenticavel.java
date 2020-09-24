package com.bytebank.bytebank.clientes;

import com.bytebank.bytebank.funcionarios.Autenticavel;

public class ClienteAutenticavel implements Autenticavel {

    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha) { return true; }
        else { return false; }
    }

}
