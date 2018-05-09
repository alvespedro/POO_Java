/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9;

import java.util.Random;

/**
 *
 * @author palves
 */
public class Publication {
    
    public Publication(Book b){
        
    }
    public void open(Book b){
       if(b.isOpen()){
        System.out.println("### The book is already open! ###");
       }else{
           b.setOpen(true);
       }
    }
    public void close(Book b){
        if(!b.isOpen()){
        System.out.println("### The book is already closed! ###");
       }else{
           b.setOpen(false);
       }
    }
    
    public void nextPage(Book b){
        b.setCurrentPage( b.getCurrentPage() + 1 );
    }
    
    public void previousPage(Book b){
        b.setCurrentPage( b.getCurrentPage() -1);
    }
    
    public void thumbingthroughabook(Book b){
        if(b.isOpen()){
            System.out.println("### Thumbing through the book! ###");
            Random rng = new Random();
            
            int whatisthenext;
            
            for(int i=0;i<10;i++){
                whatisthenext = rng.nextInt(2);
                switch(whatisthenext){
                    case 0:
                        if(b.getCurrentPage()<b.getTotalPages()){
                            this.nextPage(b);
                            System.out.println("### The current page is:"+ b.getCurrentPage() + " ###");
                        }else{
                            System.out.println("### Impossible to go to the next page, the book is over! ###");
                        }
                      break;
                    case 1:
                        if(b.getCurrentPage()>0){
                            this.previousPage(b);
                            System.out.println("### The current page is:"+ b.getCurrentPage() + " ###");
                        }else{
                            System.out.println("### Impossible to go to the previous page, you are at the first page ###");
                        }
                        
                
                }
            }
        }else{
            System.out.println("### The book is closed! ###");
        }

    }
    
    
         
}
