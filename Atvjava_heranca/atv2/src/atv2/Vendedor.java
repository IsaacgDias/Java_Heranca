/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv2;

/**
 *
 * @author Aluno_Tarde
 */
public class Vendedor extends Empregado {
  private float percentualComissao;

    public Vendedor(String _nome, float _salario) {
        super(_nome, _salario);
    }

    /**
     * @return the percentualComissao
     */
    public float getPercentualComissao() {
        return percentualComissao;
    }

    /**
     * @param percentualComissao the percentualComissao to set
     */
    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public void comissao(){
        this.salario = this.salario * this.percentualComissao;
        System.out.println("Salario com comissão: " + this.salario);
    }
    
   
}
