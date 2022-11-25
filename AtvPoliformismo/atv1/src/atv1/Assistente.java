/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv1;

/**
 *
 * @author Aluno_Tarde
 */
public abstract class Assistente extends Funcionario {
       private int numero_matricula;
       
       
        
    @Override
    public void exibirDados() {
       
    }

    /**
     * @return the numero_matricula
     */
    public int getNumero_matricula() {
        return numero_matricula;
    }

    /**
     * @param numero_matricula the numero_matricula to set
     */
    public void setNumero_matricula(int numero_matricula) {
        this.numero_matricula = numero_matricula;
    }
    
}
