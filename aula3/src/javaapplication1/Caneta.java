package javaapplication1;
public class Caneta {
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   protected boolean tampada;
    
   public void status(){
        System.out.println("Modelo"+this.cor);
        System.out.println("Ponta:"+this.ponta);
        System.out.println("Ponta:"+this.ponta);
        System.out.print("Uma caneta"+ this.cor);
        System.out.println(" está tampada?"+this.tampada);
    }
    public void rabiscar(){
        if(this.tampada){
            System.out.println("Caneta tampada,não posso rabiscar!");
           
        }else{
            System.out.println("Rabisco feito com sucesso!");
        }
        
    }
    
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
}
