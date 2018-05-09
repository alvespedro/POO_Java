 package aula05;

public class Aula05 {

    public static void main(String[] args) {
        accBank acc1 = new accBank();
        acc1.openACC("CC", "Pedro", 150f, 12345);
        acc1.showAcc();
        
        accBank acc2 = new accBank();
        acc2.openACC("CP", "Josnei", 150f, 12361);
        acc2.showAcc();
        
        acc2.depoistAcc(100);
        acc2.showAcc();
        acc2.withdrawAcc(500);
    }
    
}
