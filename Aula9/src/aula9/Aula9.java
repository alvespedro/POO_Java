/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9;

/**
 *
 * @author palves
 */
public class Aula9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p[] = new Person[2];
        p[0] = new Person("Peter Parker",23,"male");
        p[1] = new Person("Tony Stark",34,"male");
        
        Book b = new Book("How to be a Super Hero",p[1],100,0,false,p[0]);
        
        b.details();
        
        Publication pub = new Publication(b);
        
        pub.nextPage(b);
        pub.open(b);
        pub.thumbingthroughabook(b);
        
    }
    
}
