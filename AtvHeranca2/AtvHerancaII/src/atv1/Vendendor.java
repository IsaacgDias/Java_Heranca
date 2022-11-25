/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv1;

/**
 *
 * @author Aluno_Tarde
 */
public class Vendendor extends Empregado {
    private float valor_vendas;
    private float comissao;

    
    public Vendendor(String _nome, String _endereco, String _telefone) {
        super(_nome, _endereco, _telefone);
    }

    /**
     * @return the valor_vendas
     */
    public float getValor_vendas() {
        return valor_vendas;
    }

    /**
     * @param valor_vendas the valor_vendas to set
     */
    public void setValor_vendas(float valor_vendas) {
        this.valor_vendas = valor_vendas;
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
        this.comissao = this.valor_vendas * this.comissao;
        this.valor_vendas = this.valor_vendas + this.comissao;
    }
    
    public void exibirVendedor(){
        this.valor_vendas = this.valor_vendas * this.comissao;
        System.out.println("Nome: " + getNome());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Salario base: " + getSalarioBase());
        System.out.println("Salario com comissão: " + this.valor_vendas);
    }
}
