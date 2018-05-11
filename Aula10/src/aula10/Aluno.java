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
public class Aluno {
    private int matricula;
    private String curso;
    
    public Aluno(int matricula,String caractere){
        this.setMatricula(matricula);
        this.setCurso(caractere);
    }
    
    //Métodos Setters

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String caractere) {
        this.curso = caractere;
    }
    
    //Métodos Getters

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
    
    public void cancelamatricula(){
        this.setMatricula(0);
        System.out.println("### Matricula Cancelada ###");
    }
    
}
