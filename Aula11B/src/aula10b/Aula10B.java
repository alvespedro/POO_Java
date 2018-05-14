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
public class Aula10B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setIdade(35);
        v1.setName("TONY STARK");
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setName("Thor");
        a1.setIdade(700);
        a1.setSexo("M");
        a1.setMatricula(1234);
        a1.setCurso("SuperHeroes - Master");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setName("Peter Park");
        b1.setIdade(15);
        b1.setSexo("M");
        b1.setMatricula(122222);
        b1.setCurso("SuperHeroes - Beginners ");
        b1.pagarMensalidade();
        b1.renovarbolsa();
        System.out.println(b1.toString());
    }
    
}
