/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10b;

/**
 *
 * @author palves
 */
public abstract class Pessoa {
    protected String name;
    protected int idade;
    protected String sexo;
    
    public void fazerAniversario(){
        this.idade++;
    }
    
    //métodos setters

    public void setName(String name) {
        this.name = name;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //métodos getters

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "name=" + this.name + ", idade=" + this.idade + ", sexo=" + this.sexo + '}';
    }
    
    
    
}
