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
public class Pessoa {
 
    private String nome;
    private int idade;
    private String sexo;
    
//    public Pessoa(String nome,int idade,String sexo){
//        this.setNome(nome);
//        this.setIdade(idade);
//        this.setSexo(sexo);
//    }
//    
    //Métodos Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //Métodos Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }
    
    public void fazerAniversario(){
        this.setIdade(this.getIdade()+1);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
}
