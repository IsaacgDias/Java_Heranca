/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv1;

/**
 *
 * @author Aluno_Tarde
 */
public class Empregado extends Pessoa {
    private int codigoSetor;
    public float salarioBase;
    private float imposto;
    private float total;
    
    public Empregado(String _nome, String _endereco, String _telefone) {
        super(_nome, _endereco, _telefone);
    }

    /**
     * @return the codigoSetor
     */
    public int getCodigoSetor() {
        return codigoSetor;
    }

    /**
     * @param codigoSetor the codigoSetor to set
     */
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    /**
     * @return the salarioBase
     */
    public float getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * @return the imposto
     */
    public float getImposto() {
        return imposto;
    }

    /**
     * @param imposto the imposto to set
     */
    public void setImposto(float imposto) {
        this.imposto = imposto;
    }
    
    public void calcularSalario(){
       this.imposto = this.salarioBase * this.imposto;
       total = this.salarioBase - this.imposto;
    }
    public void exibirEmpregado(){
        System.out.println("Codigo do setor: " + getCodigoSetor());
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Salario Base: " + this.salarioBase);
        System.out.println("Salario com imposto: " + total);
    }
    
}
