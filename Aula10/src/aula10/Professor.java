/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author palves
 */
public class Professor extends Pessoa{
    private String especialidade;
    private int salario;
    
    public Professor( String esp, int sal){
        this.setEspecialidade(esp);
        this.setSalario(sal);
    }

    //Métodos Setters
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    //Métodos Getters
    public String getEspecialidade() {
        return especialidade;
    }

    public int getSalario() {
        return salario;
    }
    
    public void ReceberAumento( int aumento){
        this.setSalario(this.getSalario()+aumento);
    }
    
}
