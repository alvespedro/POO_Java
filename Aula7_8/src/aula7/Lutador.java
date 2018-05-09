package aula7;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float atura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Construtor
    public Lutador( String nome , String na , int id, float alt ,float peso, int vit , int der , int emp) {
        this.setNome(nome);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAtura(alt);
        this.setPeso(peso);
        this.setVitorias(vit);
        this.setDerrotas(der);
        this.setEmpates(emp);
        
    }
    
    
    //Métodos Get
    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAtura() {
        return atura;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    
    
    //Métodos Set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public void setIdade(int idadecategoria) {
        this.idade = idade;
    }

    public void setAtura(float atura) {
        this.atura = atura;
    }

    private void setCategoria() {
        if(this.getPeso()<52.2){
            this.categoria = ("Inválido!");
        }else if(this.getPeso()<=70.3){
            this.categoria = ("Leve");
        }else if(this.getPeso()<=83.9){
            this.categoria = ("Médio");
        }else if(this.getPeso()<=120.2){
            this.categoria = ("Pesado");
        }else{
            this.categoria = ("Inválido!");
        }
        
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public void apresentar(){
        System.out.println("Lutador:" + this.getNome());
        System.out.println("Nacionalidade:" + this.getNacionalidade());
        System.out.println("Peso:" + this.getPeso());
        System.out.println("Idade:" + this.getPeso());
        System.out.println("Categoria:" + this.getCategoria());
        System.out.println("Vitorias:" + this.getVitorias());
        System.out.println("Derrotas:" + this.getDerrotas());
        System.out.println("Empates:" + this.getEmpates());
        
    }
    
    public void status(){
        System.out.println("Lutador:" + this.getNome());
        System.out.println("Categoria:" + this.getCategoria());
        System.out.println("Vitorias:" + this.getVitorias());
        System.out.println("Derrotas:" + this.getDerrotas());
        System.out.println("Empates:" + this.getEmpates());
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
        
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
}
