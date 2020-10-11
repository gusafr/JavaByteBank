package br.com.bytebank.banco;

import br.com.bytebank.banco.modelo.Gerente;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TesteFuncionario {

    @Test
    public void deveValidarBonificacaoFuncionario() {
        Gerente Gerente = new Gerente();
        Gerente.setSalario(1000.0);

        assertEquals(100.0, Gerente.getBonificacao(), 10000.0);

    }

}
