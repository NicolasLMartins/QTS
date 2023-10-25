package tests.negocio;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import negocio.ContaCorrente;
import negocio.GerenciadorContas;

public class GerenciadorContasTest_Ex03 {

    @Test
    public void testTransfereValor() {

        // CENÁRIO
        ContaCorrente cc1 = new ContaCorrente(1, 1000.0, true);
        ContaCorrente cc2 = new ContaCorrente(2, 200.0, true);

        List<ContaCorrente> contasClientes = new ArrayList<>();
        contasClientes.add(cc1);
        contasClientes.add(cc2);
        
        GerenciadorContas gerContas = new GerenciadorContas(contasClientes);

        // EXECUÇÃO
        boolean sucesso = gerContas.transfereValor(1, 100.0, 2);

        // VERIFICAÇÃO
        assertTrue(sucesso);
        assertThat(cc2.getSaldo(), is(300.0));
        assertThat(cc1.getSaldo(), is(900.0));
    }
}
