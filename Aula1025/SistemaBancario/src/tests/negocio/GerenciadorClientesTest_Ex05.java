package tests.negocio;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import negocio.Cliente;
import negocio.GerenciadorClientes;
import negocio.IdadeNaoPermitidaException;

// Classe de testes criada para  garantir o funcionamento das principais operações sobre contas, realizadas pela classe GerenciadorContas.
public class GerenciadorClientesTest_Ex05 {

    private GerenciadorClientes gerClientes;
    private int idCliente01 = 1;
    private int idCliente02 = 2;

    @Before
    public void setUp () {
        // CENÁRIO
        Cliente cliente01 = new Cliente(idCliente01, "Nícolas Lisbôa Martins", 17, "nicolas@concordiasl.com.br", 1, true);
        Cliente cliente02 = new Cliente(idCliente02, "Diego Oliveria Martins", 42, "diegoom2001@gmail.com", 2, true);

        List<Cliente> clientesDoBanco =  new ArrayList<>();
        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);

        gerClientes = new GerenciadorClientes(clientesDoBanco);

        System.out.println("BEFORE FOI EXECUTADO");
    }
    
    @After
    public void tearDown() {
        gerClientes.limpa();

        System.out.println("AFTER FOI EXECUTADO");
    }

    // Teste básico da pesquisa de um cliente a partir de seu ID.
    @Test
    public void testPesquisaCliente() {
        // EXECUÇÃO
        Cliente cliente = gerClientes.pesquisaCliente(idCliente01);
        // Cliente cliente = gerClientes.pesquisaCliente(2);

        // VERIFICAÇÃO
        assertThat(cliente.getId(), is(idCliente01));
        // assertThat(cliente.getId(), is(2));
        assertThat(cliente.getEmail(), is("nicolas@concordiasl.com.br"));
        // assertThat(cliente.getEmail(), is("diegoom2001@gmail.com"));
    }

    // Teste básico da remoção de um cliente a partir de seu ID.
    @Test
    public void testRemoveCliente() {
        // EXECUÇÃO
        boolean clienteRemovido = gerClientes.removeCliente(idCliente02);
    
        // VERIFICAÇÃO
        assertThat(clienteRemovido, is(true));
        assertThat(gerClientes.getClientesDoBanco().size(), is(1));
        assertNull(gerClientes.pesquisaCliente(idCliente02));
    }

    @Test
    public void testPesquisaClienteInexistente() {
        //EXECUÇÃO
        Cliente cliente = gerClientes.pesquisaCliente(1001);
        //VERIFICAÇÃO
        assertNull(cliente);
    }

    @Test
    public void testRemoveClienteInexistente() {
        //EXECUÇÃO
        boolean clienteRemovido = gerClientes.removeCliente(1001);
        //VERIFICAÇÃO
        assertThat(clienteRemovido, is(false));
        assertThat(gerClientes.getClientesDoBanco().size(), is(2));
    }

    @Test
    public void testClienteIdadeAceitavel_01() throws IdadeNaoPermitidaException {
        //CENÁRIO
        Cliente cliente = new Cliente(1, "Nícolas", 25, "nicolas@concordiasl.com.br", 1, true);

        //EXECUÇÃO
        boolean idadeValida = gerClientes.validaIdade(cliente.getIdade());
        
        //VERIFICAÇÃO
        assertTrue(idadeValida);
    }

    @Test
    public void testClienteIdadeAceitavel_02() throws IdadeNaoPermitidaException {
        //CENÁRIO
        Cliente cliente = new Cliente(1, "Nícolas", 18, "nicolas@concordiasl.com.br", 1, true);

        //EXECUÇÃO
        boolean idadeValida = gerClientes.validaIdade(cliente.getIdade());
        
        //VERIFICAÇÃO
        assertTrue(idadeValida);
    }

    @Test
    public void testClienteIdadeAceitavel_03() throws IdadeNaoPermitidaException {
        //CENÁRIO
        Cliente cliente = new Cliente(1, "Nícolas", 65, "nicolas@concordiasl.com.br", 1, true);

        //EXECUÇÃO
        boolean idadeValida = gerClientes.validaIdade(cliente.getIdade());
        
        //VERIFICAÇÃO
        assertTrue(idadeValida);
    }

    @Test
    public void testClienteIdadeAceitavel_04() throws IdadeNaoPermitidaException {
        //CENÁRIO
        Cliente cliente = new Cliente(1, "Nícolas", 18, "nicolas@concordiasl.com.br", 1, true);

        //EXECUÇÃO
        try {
            gerClientes.validaIdade(cliente.getIdade());
        } catch (Exception e) {
            assertThat(e.getMessage(), is(IdadeNaoPermitidaException.MSG_IDADE_INVALIDA));
        }
        
        //VERIFICAÇÃO
        // assertFalse(idadeValida);
    }
}
