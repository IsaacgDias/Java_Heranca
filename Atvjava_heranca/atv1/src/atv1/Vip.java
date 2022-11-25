/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv1;

/**
 *
 * @author Aluno_Tarde
 */
public class Vip extends Ingresso {
    private double adiconal = 200;

    public Vip(double _valor) {
        super(_valor);
    }

    /**
     * @return the adiconal
     */
    public double getAdiconal() {
        return adiconal;
    }

    /**
     * @param adiconal the adiconal to set
     */
    public void setAdiconal(double adiconal) {
        this.adiconal = adiconal;
    }
    public void imprimeValor(){
       
    }
}
