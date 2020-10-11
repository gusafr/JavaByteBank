package br.com.bytebank.banco;

import br.com.bytebank.banco.modelo.Cliente;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class TestaCliente {
    
    @Test
    public void deveVerificarNomePreechido() {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Gustavo Almeida Freitas");

        assertEquals("Gustavo Almeida Freitas", cliente1.getNome());

    }

}
