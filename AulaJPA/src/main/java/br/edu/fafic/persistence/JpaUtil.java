/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Luciano
 */
public class JpaUtil  {
    
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("AulaJPA_PU");
    
    private EntityManager em;

    public EntityManager getEm() {
       em = emf.createEntityManager();
        return em;
    }
    
    public Object saveOrUpdate(Object o){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        o = em.merge(o);
        em.getTransaction().commit();
        em.close();
        return o;
    }
    
    //para busca de objetos via find é necessário abrir e fechar a
    //transação devido ao acesso concorrente
    //ou seja alguem pode estar alterando um registro que vc quer ler
    //e isso garante uma das regras ACID da camada de dados
    // I - isolação (toda transação não pode sofrer interferência por acess concorrente)
    public Object findById(Class clazz, Long id){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Object o = em.find(clazz, id);
        em.getTransaction().commit();
        em.close();
        return o;
    }
    
   
    
    public void remove(Object o){
        
    }
    
    
}
