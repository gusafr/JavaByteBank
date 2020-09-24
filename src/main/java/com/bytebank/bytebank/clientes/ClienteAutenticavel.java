package com.bytebank.bytebank.clientes;

import com.bytebank.bytebank.funcionarios.AutenticacaoUtil;
import com.bytebank.bytebank.funcionarios.Autenticavel;

public class ClienteAutenticavel implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public ClienteAutenticavel() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
      return this.autenticador.autentica(senha);
    }

}
