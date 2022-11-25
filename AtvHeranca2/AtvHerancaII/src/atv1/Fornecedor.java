/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv1;

/**
 *
 * @author Aluno_Tarde
 */
public class Fornecedor extends Pessoa {
    private float valorCredito;
    private float valorDivida;

    public Fornecedor(String _nome, String _endereco, String _telefone) {
        super(_nome, _endereco, _telefone);
    }

    /**
     * @return the valorCredito
     */
    public float getValorCredito() {
        return valorCredito;
    }

    /**
     * @param valorCredito the valorCredito to set
     */
    public void setValorCredito(float valorCredito) {
        this.valorCredito = valorCredito;
    }

    /**
     * @return the valorDivida
     */
    public float getValorDivida() {
        return valorDivida;
    }

    /**
     * @param valorDivida the valorDivida to set
     */
    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    public void obterSaldo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Valor do Credito: " + getValorCredito());
        System.out.println("Valor da Divida: " + getValorDivida());
    }
}
