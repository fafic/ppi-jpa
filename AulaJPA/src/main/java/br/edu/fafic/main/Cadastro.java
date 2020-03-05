/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.main;

import br.edu.fafic.enums.TipoPessoa;
import br.edu.fafic.model.Cliente;
import br.edu.fafic.model.Endereco;
import br.edu.fafic.persistence.JpaUtil;

/**
 *
 * @author Luciano
 */
public class Cadastro {
      
    
    
       
    public static void main(String[] args) {
        
        JpaUtil jpa = new JpaUtil();
       
          //    Cadastro de Veiculos
        
//      Veiculo fusca = new Veiculo("VW", "New Bettle", "CZ-1234", 32000.0, "2012");
//      Veiculo bmw = new Veiculo("BMW", "X5", "CZ-5001", 532000.0, "2018");
//      Veiculo argo = new Veiculo("Fiat", "Argo", "CZ-2525", 45000.0, "2019");
//      Veiculo sandero = new Veiculo("Renault", "Sandero", "CZ-1202", 42000.0, "2018");
//        
//        jpa.saveOrUpdate(fusca);
//        jpa.saveOrUpdate(bmw);
//        jpa.saveOrUpdate(argo);
//        jpa.saveOrUpdate(sandero);
//    
//     
      
      
     // Cadastro de Loja e associacao dos veiculos cadastrados
 /*     
      Loja czVeiculos = new Loja();
      Loja gridCar = new Loja();

      czVeiculos.setCnpj("253.45685/0001-56");
      czVeiculos.setNome("BCC Veículos");

      gridCar.setCnpj("452.15263/0001-12");
      gridCar.setNome("Grid Car Veiculos");
      

      czVeiculos.getEndereco().setBairro("Centro");
      czVeiculos.getEndereco().setComplemento("");
      czVeiculos.getEndereco().setLocalidade("Cajazeiras");
      czVeiculos.getEndereco().setLogradouro("Av. Major José Marques");
      czVeiculos.getEndereco().setNumero("S/N");
      czVeiculos.getEndereco().setUf("PB");

      gridCar.getEndereco().setBairro("Centro");
      gridCar.getEndereco().setComplemento("");
      gridCar.getEndereco().setLocalidade("Cajazeiras");
      gridCar.getEndereco().setLogradouro("Av. Joao Pessoa");
      gridCar.getEndereco().setNumero("500");
      gridCar.getEndereco().setUf("PB");

      List<Veiculo> veiculos1 = new ArrayList();
      List<Veiculo> veiculos2 = new ArrayList();
      
      veiculos1.add((Veiculo)jpa.findById(Veiculo.class, 1l));
      veiculos1.add((Veiculo)jpa.findById(Veiculo.class, 2l));
      czVeiculos.setVeiculos(veiculos1);
      
      veiculos1.forEach((v1) -> {
          v1.setPessoa(czVeiculos);
      });
       
      veiculos2.add((Veiculo)jpa.findById(Veiculo.class, 3l));
      veiculos2.add((Veiculo)jpa.findById(Veiculo.class, 4l));
      gridCar.setVeiculos(veiculos2);
      
      veiculos2.forEach((v2) ->{
          v2.setPessoa(gridCar);
      });
      
      jpa.saveOrUpdate(czVeiculos);
      jpa.saveOrUpdate(gridCar);
                                        */

        // Adicionando acessorios a Veiculoss
/*
      Veiculo fusca = (Veiculo)jpa.findById(Veiculo.class, 1l);
      Veiculo bmw = (Veiculo)jpa.findById(Veiculo.class, 2l);
      Veiculo argo = (Veiculo)jpa.findById(Veiculo.class, 3l);
      Veiculo sandero = (Veiculo)jpa.findById(Veiculo.class, 4l);

      Acessorio tetoSolar = new Acessorio();
      Acessorio arDigital = new Acessorio();
      Acessorio multimedia = new Acessorio();
      tetoSolar.setDescricao("Teto Solar");
      arDigital.setDescricao("Ar-Condicionado Digital");
      multimedia.setDescricao("Multimedia com GPS");

      tetoSolar.setVeiculos(Arrays.asList(bmw));
      arDigital.setVeiculos(Arrays.asList(bmw, fusca, sandero, argo));
      multimedia.setVeiculos(Arrays.asList(bmw,sandero));

      jpa.saveOrUpdate(tetoSolar);
      jpa.saveOrUpdate(arDigital);
      jpa.saveOrUpdate(multimedia);
                                    */
      
      //Salvando o funcionario e vinculando o mesmo a Loja
     
  /*
      Funcionario jose = new Funcionario();
      jose.setMatricula("2321");
      jose.setNome("José da Silva");
      jose.setSalario(1000.00);
      jose.setTipoPessoa(TipoPessoa.FUNCIONARIO);
      jose.getEndereco().setBairro("Jd Oásis");
      jose.getEndereco().setComplemento("3A");
      jose.getEndereco().setLocalidade("Cajazeiras");
      jose.getEndereco().setLogradouro("Rua Padre Ibiapina");
      jose.getEndereco().setNumero("250");
      jose.getEndereco().setUf("PB");
      Loja loja = (Loja)jpa.findById(Loja.class, 2l);
      jose.setLoja(loja);
      loja.getFuncionarios().add(jose);
      jpa.saveOrUpdate(jose);
                                    */
    /*
       Cliente cliente = new Cliente();
       cliente.setCpf("526.369.528-89");
       cliente.setNome("Michael Schumacher");
       cliente.setTipoPessoa(TipoPessoa.CLIENTE);
       cliente.getEndereco().setBairro("Monza");
       cliente.getEndereco().setComplemento("");
       cliente.getEndereco().setLocalidade("Cajazeiras");
       cliente.getEndereco().setLogradouro("Av Champs Elise");
       cliente.getEndereco().setNumero("30");
       cliente.getEndereco().setUf("PB");
       
       jpa.saveOrUpdate(cliente);
       
       Cliente cliente2 = new Cliente();
       cliente2.setCpf("520.145.756-45");
       cliente2.setNome("Rubens Barrichello");
       cliente2.setTipoPessoa(TipoPessoa.CLIENTE);
       cliente2.getEndereco().setBairro("Ímola");
       cliente2.getEndereco().setComplemento("");
       cliente2.getEndereco().setLocalidade("Cajazeiras");
       cliente2.getEndereco().setLogradouro("Av Nurburgring");
       cliente2.getEndereco().setNumero("70");
       cliente2.getEndereco().setUf("PB");
         
       jpa.saveOrUpdate(cliente2);
                                                 */       
    }
    
}
