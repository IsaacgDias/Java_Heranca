/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv1;

/**
 *
 * @author Aluno_Tarde
 */
public class Administrativo extends Assistente {
    private String turno = "Dia";
    private String adicional = "Noturno";
    

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    /**
     * @return the adicional
     */
    public String getAdicional() {
        return adicional;
    }

    /**
     * @param adicional the adicional to set
     */
    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }
    @Override
    public void exibirDados(){
        int matricula = (super.getNumero_matricula()+567568);
        System.out.println("---Adminstrativo---");
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("Turno: " + this.turno );
        System.out.println("Turno Adicional: " + this.adicional);
        System.out.println("---------------------------------");
    }
    
}
