package aula04;

public class Aula04 {

    
    public static void main(String[] args) {
      Caneta c1 = new Caneta("BIC","AMARELA",0.4f);
      c1.status();
      System.out.println("Modelo get:"+c1.getModelo());
      
      Caneta c2 = new Caneta("FaberCastel","Preta",1.0f);
      c2.status();
    }
    
}
