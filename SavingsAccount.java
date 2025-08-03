
package Bank;

public class SavingsAccount extends Account{
    //attributes
    private  double interest;
    private String savingsPlan;
    //    private static double transactionFee=0.01;

    
    
    //constructors

    public SavingsAccount() {
    }

    public SavingsAccount(double interest, String savingsPlan, String userName, String accountType, int accountNumber, double amount, double transactionFee) {
        super(userName, accountType, accountNumber, amount, transactionFee);
        this.interest = interest;
        this.savingsPlan = savingsPlan;
    }
    
    
 //getters

    @Override
    public double getTransactionFee() {
        return super.getTransactionFee(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getAccountNumber() {
        return super.getAccountNumber(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getAccountType() {
        return super.getAccountType(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getAmount() {
        return super.getAmount(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public double getInterest() {
        return interest;
    }

    public String getSavingsPlan() {
        return savingsPlan;
    }

   

    @Override
    public String getUserName() {
        return super.getUserName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
 
    //setters

    @Override
    public void setTransactionFee(double transactionFee) {
        super.setTransactionFee(transactionFee); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setAccountNumber(int accountNumber) {
        super.setAccountNumber(accountNumber); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setAccountType(String accountType) {
        super.setAccountType(accountType); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setAmount(double amount) {
        super.setAmount(amount); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setSavingsPlan(String savingsPlan) {
        this.savingsPlan = savingsPlan;
    }

  

    @Override
    public void setUserName(String userName) {
        super.setUserName(userName); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
   
    //overriden methods
 public void deposit(double amount){
        super.setAmount(super.getAmount()+amount);
        System.out.println(amount+" has been succesfully depositted in your currentAccount...");
    }
    @Override
    public void checkBalance(){
        System.out.println("Your current Balance is :"+this.getAmount() );
    }
    
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
    
}
