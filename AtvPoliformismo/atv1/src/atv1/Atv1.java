/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv1;

/**
 *
 * @author Aluno_Tarde
 */
public class Atv1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Funcionario f1 = new Tecnico();
      
      f1.setNome("Joana");
      f1.setSalario(1212);
      f1.exibirDados();
      
      Funcionario f2 = new Administrativo();
      f2.setNome("Lucas");
      f2.setSalario(2133);
      f2.exibirDados();
    }
    
}
