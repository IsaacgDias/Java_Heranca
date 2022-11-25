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
       Ingresso i1 = new Ingresso(100);
        i1.imprimeValor();
       
       Normal n1 = new Normal(45);
       n1.IngressoNormal();
        
       Vip v1 = new Vip(312);
        System.out.println("VIP: ");   v1.imprimeValor();
       
        CamaroteInferior c1 = new CamaroteInferior(500);
            System.out.println("Camarote Inferior: " + c1.getCamarote());
            
        CamaroteSuperior s1 = new CamaroteSuperior(700);
            System.out.println("Camarote Superior: " + s1.getValor());
    }
    
}
