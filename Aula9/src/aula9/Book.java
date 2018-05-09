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
public class Book {
    
    private String title;
    private Person author;
    private int totalPages;
    private int currentPage;
    private boolean open;
    private Person reader;
    
    public Book(String title,Person Author,int totpages,int currentPage,boolean open,Person reader){
        this.setTitle(title);
        this.setAuthor(Author);
        this.setTotalPages(totpages);
        this.setCurrentPage(currentPage);
        this.setOpen(open);
        this.setReader(reader);
    }
    
    //Getters Method
    public String getTitle() {
        return title;
    }

    public Person getAuthor() {
        return author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public boolean isOpen() {
        return open;
    }

    public Person getReader() {
        return reader;
    }
    
    //Setters Method

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void setReader(Person reader) {
        this.reader = reader;
    }
    
    public void details(){
        System.out.println("### Book Title:" + this.getTitle() +" ###");
        System.out.println("### Book Author:" + this.getAuthor().getName() +" ###");
        System.out.println("### Reader:" + this.getReader().getName() +" ###");
        if ( this.isOpen()){
            System.out.println("### Total of Pages:" + this.getTotalPages() +" ###");
            System.out.println("### CurrentPage:" + this.getCurrentPage() +" ###");
        }else{
            System.out.println("### The Book is CLOSED! =/ ###");
        }
    }
    
    
    
}
