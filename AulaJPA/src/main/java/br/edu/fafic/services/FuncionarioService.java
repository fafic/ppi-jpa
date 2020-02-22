/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.services;

import br.com.luciano.aulajpa.Funcionario;
import br.com.luciano.aulajpa.JpaUtil;
import javax.persistence.Query;

/**
 *
 * @author Luciano
 */
public class FuncionarioService {
    
    private final JpaUtil jpa;
    
    public FuncionarioService(){
        jpa = new JpaUtil();
    }
    
    public Funcionario getFuncioarioByNome(String nome){
       Query query = jpa.getEm().createNamedQuery("funcionarioByName");
       query.setParameter("nome", nome);
       return (Funcionario) query.getSingleResult();
    }
    
    
}
