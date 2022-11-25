/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv1;

/**
 *
 * @author Aluno_Tarde
 */
public class Tecnico extends Assistente {
    private double bonus = 532;

    
    @Override
    public void exibirDados(){
        double total = (super.getSalario()+bonus);
        int matricula = (super.getNumero_matricula()+2323221);
        System.out.println("---Técnico---");
        System.out.println("Numero de matricula: " + matricula);
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("Salario com bonus: "+ total);
        System.out.println("---------------------------------");
       
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
