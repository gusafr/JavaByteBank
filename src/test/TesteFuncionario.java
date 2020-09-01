import com.bytebank.bytebank.Funcionario;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TesteFuncionario {

    @Test
    public void deveValidarBonificacaoFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(1000.0);

        assertEquals(100.0, funcionario.getBonificacao(), 10000.0);

    }

}
