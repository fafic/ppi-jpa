/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.main;

import br.edu.fafic.persistence.JpaUtil;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Luciano
 */
public class Consultas {
    public static void main(String[] args) {
       
         JpaUtil jpa = new JpaUtil();
//     
//         Query query = jpa.getEm().createQuery("select v from Veiculo v where v.anoFabricacao=:anoFabricacao and v.valor"
//                 + "> :valor");
//         query.setParameter("anoFabricacao", "2019");
//         query.setParameter("valor", 850000.00);
//         List<Veiculo> veiculos = query.getResultList();
//         veiculos.forEach(v -> System.out.println(v));
         
//         TypedQuery<Veiculo> typedQuery = jpa.getEm().createQuery("select v from Veiculo v where v.anoFabricacao=:anoFabricacao", Veiculo.class);
//         typedQuery.setParameter("anoFabricacao", "2019");
//         List<Veiculo> veiculos = typedQuery.getResultList();
//          veiculos.forEach(v -> System.out.println(v));
//          
          TypedQuery<String> tquery = jpa.getEm().createNamedQuery("veiculoaByAno", String.class);
          tquery.setParameter("ano", "2019");
          List<String> modelos = tquery.getResultList();
          for(String s : modelos){
              System.out.println("Modelos:" +s);
          }
//        TypedQuery<Pessoa> query = jpa.getEm().createQuery("select p from Pessoa p inner join p.veiculos v", Pessoa.class);
//        List<Pessoa> pessoas = query.getResultList();
//        for(Pessoa p : pessoas){
//            System.out.println("Pessoa "+p.getNome());
//        }

//          TypedQuery<Veiculo> query = jpa.getEm().createQuery("select v from Veiculo v inner join fetch v.pessoa", Veiculo.class);
//          List<Veiculo> veiculos = query.getResultList();
//          for(Veiculo veiculo : veiculos){
//              System.out.println("Proprietario: " +veiculo.getPessoa().getNome() + " Modelo:" +veiculo.getModelo());
//          }

//         TypedQuery<Funcionario> q = jpa.getEm().createNamedQuery("funcionarioByMatricula", Funcionario.class);
//         q.setParameter("matricula", "2321");
//         Funcionario f = q.getSingleResult();
//         System.out.println("Funcionario:" +f.toString());
         
    }
}