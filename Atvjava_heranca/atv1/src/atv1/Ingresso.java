/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv1;

/**
 *
 * @author Aluno_Tarde
 */
public class Ingresso {
    private double valor;
     
    public Ingresso(double _valor){ 
        this.valor = _valor; 
    }
    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void imprimeValor(){
        System.out.println("Ingresso: " + getValor());       
    }
}
