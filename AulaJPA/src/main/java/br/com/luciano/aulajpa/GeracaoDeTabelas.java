/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luciano.aulajpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Luciano
 */
public class GeracaoDeTabelas {
    public static void main(String[] args) {
        
        //geranado tabelas
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AulaJPA_PU");
        EntityManager em = emf.createEntityManager();
        em.clear();
       
    
    }
    
}