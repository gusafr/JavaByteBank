package br.com.bytebank.banco;

public class Conexao implements AutoCloseable {

    public Conexao() {
        System.out.println("Abrindo conexão");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

    public void close() {
        System.out.println("Fechando conexão");
    }
}
