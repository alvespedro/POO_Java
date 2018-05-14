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
public class Bolsista extends Aluno {
    
    private float bolsa;
    public void renovarbolsa(){
        System.out.println("Bolsa Renovada" + this.name + "!");
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno"+this.name);
    }
}
