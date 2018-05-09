
package aula05;

public class accBank {
    
    private int accNumber ;
    private String accType;
    private String accOwner;
    private float accBalance;
    private Boolean accStatus;
    
    public void accBack(){
        this.accStatus = false;
        this.accBalance = 0;
        
    }     
    /**
     * @return the accNumber
     */
    public int getAccNumber() {
        return accNumber;
    }

    /**
     * @param accNumber the accNumber to set
     */
    public void setAccNumber( int accNumber) {
        this.accNumber = accNumber;
    }

    /**
     * @return the accType
     */
    public String getAccType() {
        return accType;
    }

    /**
     * @param accType the accType to set
     */
    public void setAccType(String accType) {
        this.accType = accType;
    }

    /**
     * @return the accOwner
     */
    public String getAccOwner() {
        return accOwner;
    }

    /**
     * @param accOwner the accOwner to set
     */
    public void setAccOwner(String accOwner) {
        this.accOwner = accOwner;
    }

    /**
     * @return the accBalance
     */
    public float getAccBalance() {
        return accBalance;
    }

    /**
     * @param accBalance the accBalance to set
     */
    public void setAccBalance(float accBalance) {
        this.accBalance = accBalance;
    }

    /**
     * @return the accStatus
     */
    public Boolean getAccStatus() {
        return accStatus;
    }

    /**
     * @param accStatus the accStatus to set
     */
    public void setAccStatus(Boolean accStatus) {
        this.accStatus = accStatus;
    }
    
    public void openACC( String typeAcc, String OwnerName , float OwnerBalance , int AccNumber ){
        setAccStatus(true);
        setAccType(typeAcc);
        if( typeAcc == "CC"){
            setAccBalance( 150.f + OwnerBalance);
        }else{
            setAccBalance(50.f + OwnerBalance);
        }
        
        setAccOwner(OwnerName);
        setAccNumber(AccNumber);
    }
    
    public void depoistAcc( float value ){
        
        if (this.getAccStatus()){
            setAccBalance( this.getAccBalance() + value );
        }else
        {
            System.out.println("Account Bank enabled");
        }
    }
    
    public void withdrawAcc( float value ){
        if(this.getAccStatus()){
            if ( this.getAccBalance() > value ){
                this.setAccBalance( this.getAccBalance() - value);
                System.out.println("Withdraw Succefully");
            }else{
                System.out.println("Insufficient funds");
            }
        }else{
            System.out.println("Account Bank enabled");
        }
    } 
    
    public void monthlyPaymentAcc(){
         if(this.getAccStatus()){
             if(this.getAccType()=="CC"){
                 if(this.getAccBalance()>12){
                     this.setAccBalance(this.getAccBalance() - 12 );
                 }else{
                     System.out.println("Insuficient funds");
                  }
             }else{
                 if(this.getAccBalance()>20 ){
                     this.setAccBalance(this.getAccBalance() - 20 );
                 }else{
                     System.out.println("Insuficient funds");
                 }
             }
        } 
    }
    
    public void showAcc(){
        System.out.println("Account Number:" + this.getAccNumber());
        System.out.println("Account Balance:" + this.getAccBalance());
        System.out.println("Account Type:" + this.getAccType());
        System.out.println("Account Owner:" + this.getAccOwner());
    }
}