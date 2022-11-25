/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv3;

/**
 *
 * @author Aluno_Tarde
 */
public class Atv3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Peixe p1 = new Peixe("Madarim", 30, 0, "Dourado", "Agua-Salgada", 30);
        p1.setCaracteristica("Macho");
        System.out.println("-----Dados do Peixe-----");
        Peixe p2 = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", (float) 1.5);
        p2.setCaracteristica("Barbatanas e cauda");
        p1.dadosPeixe();
        
        
        System.out.println("---------------------");
        
        Mamifero m1 = new Mamifero("Camelo", 150, 4, "Amarelo", "Terra", (float) 2.0);
        m1.setAlimento("Vegetais");
        System.out.println("----Dados do Mamifero----");
        Mamifero m2 = new Mamifero("Urso-do-Canadá", 180, 4, "Vermelho", "Terra", (float) 0.5);
        m2.setAlimento("Mel");
        m1.dadosMamifero();
    }

   
    
}
