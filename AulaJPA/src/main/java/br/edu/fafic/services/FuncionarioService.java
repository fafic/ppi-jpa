/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.services;

import br.edu.fafic.model.Funcionario;
import br.edu.fafic.persistence.JpaUtil;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Luciano
 * 
 * Classe que executa regras de negócio e acesso aos dados, está entra a camada de 
 * persistência e model
 */
public class FuncionarioService {
    
    private final JpaUtil jpa;
    
    public FuncionarioService(){
        jpa = new JpaUtil();
    }
    
    public Funcionario save(Funcionario funcionario){
        return (Funcionario)jpa.saveOrUpdate(funcionario);
    }
    
    public Funcionario getFuncionarioById(Long id){
        return (Funcionario) jpa.findById(Funcionario.class, id);
    }
    
    public void remove(Funcionario funcionario){
        jpa.remove(funcionario);
    }
    
    public List<Funcionario> getAll(){
        Query query = jpa.getEm().createNamedQuery("funcionario.getAll");
        return query.getResultList();
    }
    
    public Funcionario getFuncioarioByMatricula(String matricula){
       Query query = jpa.getEm().createNamedQuery("funcionarioByMatricula");
       query.setParameter("matricula", matricula);
       return (Funcionario) query.getSingleResult();
    }
    
    
}
