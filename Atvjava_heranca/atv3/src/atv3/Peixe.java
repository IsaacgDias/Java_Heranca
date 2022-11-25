/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv3;

/**
 *
 * @author Aluno_Tarde
 */
public class Peixe extends Animal {
    private String caracteristica;
        
       
       
     
    public Peixe(String _nome, float _comprimento, int _numero_patas, String _cor, String _ambiente, float _velocidade_media) {
        super(_nome, _comprimento, _numero_patas, _cor, _ambiente, _velocidade_media);
    }

    /**
     * @return the caracteristica
     */
    public String getCaracteristica() {
        return caracteristica;
    }

    /**
     * @param caracteristica the caracteristica to set
     */
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    
    public void dadosPeixe(){
        System.out.println("Nome: " + getNome());
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Numero de patas: " + getNumero_patas());
        System.out.println("Cor: " + getCor());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Velocidade media: " + getVelocidade_media());
        System.out.println("Caracteristica: " + this.caracteristica);
    }
}
