import com.bytebank.bytebank.Cliente;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;



public class TestaCliente {
    
    @Test
    public void deveVerificarNomePreechido() {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Gustavo Almeida Freitas");

        assertEquals("Gustavo Almeida Freitas", cliente1.getNome());

    }

}
