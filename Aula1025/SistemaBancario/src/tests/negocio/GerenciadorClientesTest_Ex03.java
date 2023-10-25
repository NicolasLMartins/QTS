package tests.negocio;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import negocio.Cliente;
import negocio.GerenciadorClientes;

// Classe de testes criada para  garantir o funcionamento das principais operações sobre clientes, realizadas pela classe GerenciadorClientes.

public class GerenciadorClientesTest_Ex03 {

    // Teste básico da pesquisa de um cliente a partir de seu ID.
    @Test
    public void testPesquisaCliente() {

        // CENÁRIO
        Cliente cliente01 = new Cliente(1, "Nícolas Lisbôa Martins", 17, "nicolas@concordiasl.com.br", 1, true);
        Cliente cliente02 = new Cliente(2, "Diego Oliveria Martins", 42, "diegoom2001@gmail.com", 2, true);

        List<Cliente> clientesDoBanco =  new ArrayList<>();
        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);

        GerenciadorClientes gerClientes = new GerenciadorClientes(clientesDoBanco);

        // EXECUÇÃO
        Cliente cliente = gerClientes.pesquisaCliente(1);
        // Cliente cliente = gerClientes.pesquisaCliente(2);

        // VERIFICAÇÃO
        assertThat(cliente.getId(), is(1));
        // assertThat(cliente.getId(), is(2));
        assertThat(cliente.getEmail(), is("nicolas@concordiasl.com.br"));
        // assertThat(cliente.getEmail(), is("diegoom2001@gmail.com"));
    }
    
    // Teste básico da remoção de um cliente a partir de seu ID.
    @Test
    public void testRemoveCliente() {

        // CENÁRIO
        Cliente cliente01 = new Cliente(1, "Nícolas Lisbôa Martins", 17, "nicolas@concordiasl.com.br", 1, true);
        Cliente cliente02 = new Cliente(2, "Diego Oliveria Martins", 42, "diegoom2001@gmail.com", 2, true);
    
        List<Cliente> clientesDoBanco =  new ArrayList<>();
        clientesDoBanco.add(cliente01);
        clientesDoBanco.add(cliente02);
    
        GerenciadorClientes gerClientes = new GerenciadorClientes(clientesDoBanco);
    
        // EXECUÇÃO
        boolean clienteRemovido = gerClientes.removeCliente(2);
    
        // VERIFICAÇÃO
        assertThat(clienteRemovido, is(true));
        assertThat(gerClientes.getClientesDoBanco().size(), is(1));
        assertNull(gerClientes.pesquisaCliente(2));
    }
}
