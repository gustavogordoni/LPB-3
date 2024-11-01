package br.com.projeto.ctr;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import br.com.projeto.dao.ClienteDAO;
import br.com.projeto.model.ClienteModel;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ClienteController {

    ClienteDAO clienteDAO = new ClienteDAO();

    public ClienteController() {
        this.clienteDAO = new ClienteDAO();
    }

    public String cadastrarCliente(ClienteModel clienteModel) {
        if (clienteDAO.cadastrarCliente(clienteModel)) {
            return "Cliente Cadastrado com Sucesso!";
        } else {
            return "Cliente NÃO Cadastrado!";
        }
    }

    public String atualizarCliente(ClienteModel clienteModel) {
        try {
            clienteDAO.atualizar(clienteModel);
            return "Cliente Atualizado com Sucesso!";
        } catch (Exception e) {
            return "Erro ao Atualizar: " + e.getMessage();
        }
    }

    public List<ClienteModel> listarClientes() {
        List<ClienteModel> lista = clienteDAO.listaClientes();
        if (lista == null || lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum cliente encontrado.");
        }
        return lista;
    }

    public List<ClienteModel> buscarNome(String nome) {
        List<ClienteModel> lista = clienteDAO.buscarNome(nome);
        if (lista == null || lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum cliente encontrado com o nome: " + nome);
        }
        return lista;
    }
}
