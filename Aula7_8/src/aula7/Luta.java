/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

import java.util.Random;

/**
 *
 * @author palves
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos Setters;
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    //Metodos Getter;
    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }
    
    public void marcarLuta ( Lutador l1 , Lutador l2 ){
        if(l1.getCategoria() == l2.getCategoria() && l1!= l2){
            this.setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }
    
    public void lutar(){
        if(this.isAprovada()){
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            
            Random aleatorio = new Random();
            
            int vencedor = aleatorio.nextInt(3); //0,1,2
            
            switch(vencedor){
                case 0://Empate
                    System.out.println("### EMPATE! ###");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                
                case 1://Desafiado Vence
                    System.out.println("### VITORIA DO " + this.getDesafiado().getNome() + "###");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                
                case 2://Desafiado Perde
                    System.out.println("### VITORIA DO " + this.getDesafiante().getNome() + "###");
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    break;
            }
               
        }else{
            System.out.println("Luta não pode acontecer!");
        }
    }
    
}
