package tests.negocio;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import negocio.ContaCorrente;
import negocio.GerenciadorContas;

// Classe de testes criada para  garantir o funcionamento das principais operações sobre contas, realizadas pela classe GerenciadorContas.
public class GerenciadorContasTest_Ex04 {
    
    /* Teste básico da transferência de um valor da conta de um cliente para o outro,
    estando ambos os clientes ativos e havendo saldo suficiente para tal transferência ocorrer com sucesso. */
    @Test
    public void testTransfereValor() {

        // CENÁRIO
        int idConta01 = 1;
        int idConta02 = 2;

        ContaCorrente cc1 = new ContaCorrente(idConta01, 200.0, true);
        ContaCorrente cc2 = new ContaCorrente(idConta02, 0.0, true);

        List<ContaCorrente> contasClientes = new ArrayList<>();
        contasClientes.add(cc1);
        contasClientes.add(cc2);
        
        GerenciadorContas gerContas = new GerenciadorContas(contasClientes);

        // EXECUÇÃO
        boolean sucesso = gerContas.transfereValor(1, 100.0, idConta02);

        // VERIFICAÇÃO
        assertTrue(sucesso);
        assertThat(cc2.getSaldo(), is(100.0));
        assertThat(cc1.getSaldo(), is(100.0));
    }

    @Test
    public void testTransfereValorSaldoInsuficiente() {

        // CENÁRIO
        int idConta01 = 1;
        int idConta02 = 2;

        ContaCorrente cc1 = new ContaCorrente(idConta01, 100.0, true);
        ContaCorrente cc2 = new ContaCorrente(idConta02, 0.0, true);

        List<ContaCorrente> contasClientes = new ArrayList<>();
        contasClientes.add(cc1);
        contasClientes.add(cc2);
        
        GerenciadorContas gerContas = new GerenciadorContas(contasClientes);

        // EXECUÇÃO
        boolean sucesso = gerContas.transfereValor(1, 200.0, idConta02);

        // VERIFICAÇÃO
        assertFalse(sucesso);
        assertThat(cc1.getSaldo(), is(-100.0));
        assertThat(cc2.getSaldo(), is(200.0));
    }
}
