package aula04;
public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampado;
    
    public Caneta(String modelo, String cor , float ponta){
        this.cor = cor;
        this.modelo = modelo;
        this.ponta = ponta;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void tampar(){
        this.tampado = true;
    }
    public void destampado(){
        this.tampado = false;
    }
    public void status(){
        System.out.println("Sobre A Caneta:");
        System.out.println("Moldo:"+this.modelo);
        System.out.println("Ponta:"+this.ponta);
    }
}
