/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv1;

/**
 *
 * @author Aluno_Tarde
 */
public class CamaroteInferior extends Vip {
    private double camarote;
    private double adiconal;
    public CamaroteInferior(double _valor) {
        super(_valor);
    }

    /**
     * @return the camarote
     */
    public double getCamarote() {
        return camarote;
    }

    /**
     * @param camarote the camarote to set
     */
    public void setCamarote(double camarote) {
        this.camarote = camarote;
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

   
}
