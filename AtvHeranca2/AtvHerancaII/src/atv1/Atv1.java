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
       Fornecedor f1 = new Fornecedor("Rogerio", "R-1213","(31)3333-3333");
        System.out.println("---Fornecedor---");
       f1.setValorCredito(1340);
       f1.setValorDivida(1876);
       
       f1.obterSaldo();
        System.out.println("----------------------------------------------------------");
       Empregado e1 = new Empregado("Luis", "R-aa11", "(31)3333-4444");
        System.out.println("---Empregado---");
       e1.setSalarioBase(1232);
       e1.setCodigoSetor(02);
       e1.setImposto((float) 0.10);
       
       e1.calcularSalario();
       e1.exibirEmpregado();
         System.out.println("----------------------------------------------------------");
       
       Administrador a1 = new Administrador("Fred", "R-120", "(31)3341-1223");
        System.out.println("---Administrador---");
       a1.setAjudaDeCusto(500);
       
       a1.setSalarioBase(2301);
       a1.calcularSalario();
       a1.exibirAdministrador();
       
       System.out.println("----------------------------------------------------------");
       Operario o1 = new Operario("Tom", "R-345", "(31)-2132-4342");
       System.out.println("---Operario---");
       o1.setValorProducao(800);
       o1.setComissao((float) 0.7);
       
       o1.setSalarioBase(1233);
       o1.calcularSalario();
       o1.exibirOperario();
       System.out.println("----------------------------------------------------------");
       
       
       Vendendor v1 = new Vendendor("Jhom", "R-454", "(31) 5345-4346");
        System.out.println("---Vendedor---");
       
       v1.setSalarioBase(1232);
       v1.setValor_vendas(2300);
       v1.setComissao((float) 0.8);
       
       v1.exibirVendedor();
       System.out.println("----------------------------------------------------------");
    }
    
}
