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
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno(1234,"Engenharia");
        Professor p3 = new Professor("Matematica",150);
        Funcionario p4 = new Funcionario("Ed Fisisca","Escalador");
        
        p1.setNome("Thor");
        p2.setNome("Peter Park");
        p3.setNome("Dr Strange");
        p4.setNome("Tony Stark");
        
        p1.setIdade(300);
        p2.setIdade(15);
        p3.setIdade(30);
        p4.setIdade(33);
        
        p1.setSexo("Masculino");
        p2.setSexo("Masculino");
        p3.setSexo("Masculino");
        p4.setSexo("Masculino");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        
        
        
        
        
    }
    
}
