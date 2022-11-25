/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv1;

/**
 *
 * @author Aluno_Tarde
 */
public class Administrador extends Empregado {
    private float ajudaDeCusto;
    private float total;
    
    public Administrador(String _nome, String _endereco, String _telefone) {
        super(_nome, _endereco, _telefone);
    }
   
    /**
     * @return the ajudaDeCusto
     */
    public float getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    /**
     * @param ajudaDeCusto the ajudaDeCusto to set
     */
    public void setAjudaDeCusto(float ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
     
    public void calcularSalario(){
        total = this.salarioBase + this.ajudaDeCusto;
    }
    public void exibirAdministrador(){
        System.out.println("Nome: " + getNome());
        System.out.println("Endereco: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Salario: " + getSalarioBase());
        System.out.println("Salario com ajuda de custo: " + total);
    }

}
