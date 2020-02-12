/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.luciano.aulajpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Luciano
 */
@Entity
public class Veiculo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veiculo_seq")
    @SequenceGenerator(allocationSize = 1, sequenceName = "veiculo_seq", name = "veiculo_seq")
    private Long id;
    private String marca;
    private String modelo;
    @Column(unique = true)
    private String placa;
    private String chassi;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String placa, String chassi) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.chassi = chassi;
    }
    
    
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", chassi=" + chassi + '}';
    }
    
    

       
    
    
    
    
}
