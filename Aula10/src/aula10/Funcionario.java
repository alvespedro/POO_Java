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
public class Funcionario extends Pessoa{
    private String setor;
    private String trabalho;
    
    
    public Funcionario ( String set, String trab){
        this.setSetor(set);
        this.setTrabalho(trab);
    }
    
    //Métodos Setters

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }
    
    //Métodos Getters

    public String getSetor() {
        return setor;
    }

    public String getTrabalho() {
        return trabalho;
    }
    
    public void mudarTrabalho(String novo){
        this.setTrabalho(novo);
    }
    
}
