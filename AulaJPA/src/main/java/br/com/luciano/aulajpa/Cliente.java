/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luciano.aulajpa;

import br.edu.fafci.enums.TipoPessoa;
import javax.persistence.Entity;

/**
 *
 * @author Luciano
 */
@Entity
public class Cliente  extends PessoaFisica {
   

  public Cliente(){
      setTipoPessoa(TipoPessoa.CLIENTE);
  }

    
    
}
