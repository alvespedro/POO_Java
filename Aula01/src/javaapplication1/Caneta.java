package javaapplication1;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo"+this.cor);
        System.out.println("Ponta:"+this.ponta);
        System.out.println("Ponta:"+this.ponta);
        System.out.print("Uma caneta"+ this.cor);
        System.out.println(" está tampada?"+this.tampada);
    }
    void rabiscar(){
        if(this.tampada){
            System.out.println("Caneta tampada,não posso rabiscar!");
           
        }else{
            System.out.println("Rabisco feito com sucesso!"); 
        }
        
    }
    
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
