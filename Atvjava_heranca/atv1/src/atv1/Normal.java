/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv1;

/**
 *
 * @author Aluno_Tarde
 */
public class Normal extends Ingresso {

    public Normal(double _valor) {
        super(_valor);
    }

   public void IngressoNormal(){
       System.out.println("Ingresso Normal: " + getValor());
   }
}
