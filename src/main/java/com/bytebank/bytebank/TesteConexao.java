package com.bytebank.bytebank;

public class TesteConexao {

    public static void main(String[] args) {

        try(Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (Exception ex) {
            System.out.println("Erro na chamada: " + ex.getMessage());
            ex.printStackTrace();
        }

/*        Conexao con = null;
        try {
            con = new Conexao();
            con.leDados();

        } catch (Exception ex) {
            System.out.println("Erro na conexão:" + ex.getMessage());

        } finally {
            System.out.println("finally");
            if(con != null) {
                con.close();
            }
        }*/

    }
}
