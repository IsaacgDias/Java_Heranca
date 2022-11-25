/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv2;

/**
 *
 * @author Aluno_Tarde
 */
public class Atv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Empregado e1 = new Empregado("Jorgim", 2000);
        System.out.println("Nome: " + e1.getNome());
        System.out.println("Salario: " + e1.getSalario());
        
        Gerente g1 = new Gerente("Tonim",4450);
        g1.setDepartamento("AA-342");
        System.out.println("Nome do Gerente: " + g1.getNome());
        System.out.println("Salario: " + g1.getSalario());
        
        Vendedor v1 = new Vendedor("Rogim", 1212);
        v1.setPercentualComissao((float) 0.1);
        System.out.println("Nome: " + v1.getNome());
        System.out.println("Salario sem comissão: " + v1.getSalario());
        System.out.println("Percentual da comissão: " + v1.getPercentualComissao());
        
        v1.comissao();
        
    }
    
}
