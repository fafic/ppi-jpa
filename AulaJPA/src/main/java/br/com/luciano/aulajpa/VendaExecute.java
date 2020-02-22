/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luciano.aulajpa;

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
        
        Funcionario funcionario = fs.getFuncioarioByNome("José da Silva");
        Cliente cliente = (Cliente)jpa.findById(Cliente.class, 1l);
        List<ItemVenda> itens = new ArrayList();
        itens.add(new ItemVenda(2, (Veiculo)jpa.findById(Veiculo.class, 2l)));
        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setItens(itens);
        venda.getItens().forEach(i -> i.getVeiculo().setPessoa(cliente));
        venda.setTotal(itens.stream().mapToDouble(item -> item.subTotal()).sum());
        venda = (Venda)jpa.saveOrUpdate(venda);
        jpa.saveOrUpdate(cliente);
        FuncionarioVenda fv = new FuncionarioVenda();
        fv.setFuncionario(funcionario);
        fv.setVenda(venda);
        fv.setComissao(venda.getTotal() * 0.03);
        jpa.saveOrUpdate(fv);
    }
    
   
    
}
