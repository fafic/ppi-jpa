/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafci.enums;

/**
 *
 * @author Luciano
 */
public enum TipoPessoa {
    
    CLIENTE("Cliente"),FUNCIONARIO("Funcionario"),PESSOA_JURIDICA("Pessoa Jurídica");
    
    private final  String tipo;
    
    private TipoPessoa(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    
}
