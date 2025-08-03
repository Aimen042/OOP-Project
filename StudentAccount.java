
package Bank;

public class StudentAccount extends Account{
    //attributes 
    private String institutionName;
    //private double transactionFee = 0.005;
    
    //constructors

    public StudentAccount() {
    }

    public StudentAccount(String institutionName, String userName, String accountType, int accountNumber, double amount, double transactionFee) {
        super(userName, accountType, accountNumber, amount, transactionFee);
        this.institutionName = institutionName;
    }

   
//overriden methods
    @Override
    public void deposit(double amount){
         super.setAmount(super.getAmount()+amount);
        System.out.println(amount+" has been succesfully depositted in your Student Account...");
    }
    
    @Override
    public void withdraw(double amount){
        double presentAmount = super.getAmount();
        if(presentAmount>=amount){
            double newAmount = presentAmount*this.getTransactionFee();
            super.setAmount(newAmount - amount);
        System.out.println(amount+" has been successfuly withdrawn from your currentAccount...");
        checkBalance();
        }
        else{
            System.out.println("Insufficient Funds...");
        }
    }
     @Override
    public void checkBalance(){
        System.out.println("Your current Balance is :"+this.getAmount() );
    }
    
    //getters

    @Override
    public int getAccountNumber() {
        return super.getAccountNumber(); 
    }

    @Override
    public String getAccountType() {
        return super.getAccountType(); 
    }

    public String getInstitutionName() {
        return institutionName;
    }

    @Override
    public double getAmount() {
        return super.getAmount(); 
    }

    @Override
    public double getTransactionFee() {
        return super.getTransactionFee(); 
    }

    @Override
    public String getUserName() {
        return super.getUserName(); 
    }
    //setters

    @Override
    public void setAccountNumber(int accountNumber) {
        super.setAccountNumber(accountNumber); 
    }

    @Override
    public void setAccountType(String accountType) {
        super.setAccountType(accountType); 
    }

    @Override
    public void setAmount(double amount) {
        super.setAmount(amount); 
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    @Override
    public void setTransactionFee(double transactionFee) {
        super.setTransactionFee(transactionFee); 
    }

    @Override
    public void setUserName(String userName) {
        super.setUserName(userName); 
    }
    
}
