/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.main;

import br.edu.fafic.persistence.JpaUtil;
import br.edu.fafic.model.ItemVenda;
import br.edu.fafic.model.FuncionarioVenda;
import br.edu.fafic.model.Veiculo;
import br.edu.fafic.model.Venda;
import br.edu.fafic.model.Cliente;
import br.edu.fafic.model.Funcionario;
import br.edu.fafic.services.FuncionarioService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luciano
 */
public class VendaExecute {
    public static void main(String[] args) {
        FuncionarioService fs = new FuncionarioService();
        JpaUtil jpa = new JpaUtil();
        
        Funcionario funcionario = fs.getFuncioarioByMatricula("2321");
        Cliente cliente = (Cliente)jpa.findById(Cliente.class, 6l);
        Cliente cliente2 = (Cliente)jpa.findById(Cliente.class, 7l);
        List<ItemVenda> itens = new ArrayList();
        itens.add(new ItemVenda(1, (Veiculo)jpa.findById(Veiculo.class, 2l)));
        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setItens(itens);
        venda.getItens().forEach(i -> i.getVeiculo().setPessoa(cliente));
        venda.setTotal(itens.stream().mapToDouble(item -> item.subTotal()).sum());
        venda.setFuncionario(funcionario);
        venda.setComissao(venda.getTotal() * 0.03);
        jpa.saveOrUpdate(venda);
        
        itens = new ArrayList();
        itens.add(new ItemVenda(1, (Veiculo)jpa.findById(Veiculo.class, 4l)));
        venda = new Venda();
        venda.setCliente(cliente2);
        venda.setItens(itens);
        venda.getItens().forEach(i -> i.getVeiculo().setPessoa(cliente));
        venda.setTotal(itens.stream().mapToDouble(item -> item.subTotal()).sum());
        venda.setFuncionario(funcionario);
        venda.setComissao(venda.getTotal() * 0.03);
        jpa.saveOrUpdate(venda);

    }
    
   
    
}
