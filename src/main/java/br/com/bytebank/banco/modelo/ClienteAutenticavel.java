package br.com.bytebank.banco.modelo;

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
