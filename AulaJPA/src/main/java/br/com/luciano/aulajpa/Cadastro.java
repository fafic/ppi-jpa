/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luciano.aulajpa;

import br.edu.fafci.enums.TipoPessoa;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Luciano
 */
public class Cadastro {
      
    
    
       
    public static void main(String[] args) {
        
        JpaUtil jpa = new JpaUtil();
       
          //    Cadastro de Veiculos
        
//        Veiculo fusca = new Veiculo("VW", "Fusca", "12345", "ABC322001");
//        Veiculo bmw = new Veiculo("BMW", "Z5", "52056", "DFG9696");
//        
//        jpa.saveOrUpdate(fusca);
//        jpa.saveOrUpdate(bmw);
//    
      Veiculo fusca = (Veiculo)jpa.findById(Veiculo.class, 1l);
      Veiculo bmw = (Veiculo)jpa.findById(Veiculo.class, 2l);
      Acessorio tetoSolar = new Acessorio();
      tetoSolar.setDescricao("Teto Solar");
      tetoSolar.setVeiculos(Arrays.asList(fusca, bmw));
      
      tetoSolar  = (Acessorio)jpa.saveOrUpdate(tetoSolar);
      fusca.setAcessorios(Arrays.asList(tetoSolar));
      bmw.setAcessorios(Arrays.asList(tetoSolar));
      jpa.saveOrUpdate(fusca);
      jpa.saveOrUpdate(bmw);
      
      
     // Cadastro de Loja e associacao dos veiculos cadastrados
      
//      Loja czVeiculos = new Loja();
//      czVeiculos.setCnpj("253.45685/0001-56");
//      czVeiculos.setNome("CZ Veículos");
//      List<Veiculo> veiculos = jpa.getEm().createQuery("select v from Veiculo v").getResultList();
//        System.out.println("Veiculos: " +veiculos.toString());
//      czVeiculos.setVeiculos(veiculos);
//      czVeiculos = (Loja)jpa.saveOrUpdate(czVeiculos);
//      for(Veiculo v : czVeiculos.getVeiculos()){
//          v.setPessoa(czVeiculos);
//          jpa.saveOrUpdate(v);
//      }
      
      
     
//      Funcionario jose = new Funcionario();
//      jose.setMatricula("2321");
//      jose.setNome("José da Silva");
//      jose.setSalario(1000.00);
//      jose.setTipoPessoa(TipoPessoa.FUNCIONARIO);
//      Loja loja = (Loja)jpa.findById(Loja.class, 2l);
//      jose.setLoja(loja);
//      jose = (Funcionario)jpa.saveOrUpdate(jose);
//      loja.getFuncionarios().add(jose);
//      jpa.saveOrUpdate(loja);

//       Cliente cliente = new Cliente();
//       cliente.setCpf("526.369.5268-89");
//       cliente.setNome("Michael Schumacher");
//       cliente.setTipoPessoa(TipoPessoa.CLIENTE);
//       jpa.saveOrUpdate(cliente);
      
    }
    
}
