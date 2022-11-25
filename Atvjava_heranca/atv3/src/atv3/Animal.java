/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv3;

/**
 *
 * @author Aluno_Tarde
 */
public class Animal {
    private String nome;
    private float comprimento;
    private int numero_patas;
    private String cor;
    private String ambiente;
    private float velocidade_media;
    
    public Animal(String _nome, float _comprimento, int _numero_patas, String _cor, String _ambiente, float _velocidade_media){
        this.nome = _nome;
        this.comprimento = _comprimento;
        this.numero_patas = _numero_patas;
        this.cor = _cor;
        this.ambiente = _ambiente;
        this.velocidade_media = _velocidade_media;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the comprimento
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * @return the numero_patas
     */
    public int getNumero_patas() {
        return numero_patas;
    }

    /**
     * @param numero_patas the numero_patas to set
     */
    public void setNumero_patas(int numero_patas) {
        this.numero_patas = numero_patas;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the ambiente
     */
    public String getAmbiente() {
        return ambiente;
    }

    /**
     * @param ambiente the ambiente to set
     */
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    /**
     * @return the velocidade_media
     */
    public float getVelocidade_media() {
        return velocidade_media;
    }

    /**
     * @param velocidade_media the velocidade_media to set
     */
    public void setVelocidade_media(float velocidade_media) {
        this.velocidade_media = velocidade_media;
    }
}
