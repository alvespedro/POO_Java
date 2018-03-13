
package javaapplication1;


public class JavaApplication1 {

    public static void main(String[] args) {
       Caneta c1 = new Caneta();
       c1.cor = "Azul";
       c1.tampada = false;
       
       c1.status();
       c1.rabiscar();
       c1.tampar();
       c1.rabiscar();
       c1.destampar();
       c1.rabiscar();
    }
    
}
