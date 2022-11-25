/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv1;

/**
 *
 * @author Aluno_Tarde
 */
public class Operario extends Empregado {
    private float valorProducao;
    private float comissao;
    private float t;
    public Operario(String _nome, String _endereco, String _telefone) {
        super(_nome, _endereco, _telefone);
    }

    /**
     * @return the valorProducao
     */
    public float getValorProducao() {
        return valorProducao;
    }

    /**
     * @param valorProducao the valorProducao to set
     */
    public void setValorProducao(float valorProducao) {
        this.valorProducao = valorProducao;
    }

    /**
     * @return the comissao
     */
    public float getComissao() {
        return comissao;
    }

    /**
     * @param comissao the comissao to set
     */
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
    public void calcularSalario(){
      this.comissao =  this.valorProducao * comissao;
      t = this.valorProducao + this.comissao;
    }
    
    public void exibirOperario(){
        System.out.println("Nome: " + getNome());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Salario base: " + getSalarioBase());
        System.out.println("Salario com comissão: " + t);
    }
    
}
