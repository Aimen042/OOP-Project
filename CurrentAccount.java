package Bank;

public class CurrentAccount extends Account{
    //attributes
    private double monthlyTransactionLimit;
//    private static double transactionFee=0.01;
    
    //Constructors

    public CurrentAccount() {
    }

    public CurrentAccount(double monthlyTransactionLimit, String userName, String accountType, int accountNumber, double amount, double transactionFee) {
        super(userName, accountType, accountNumber, amount, transactionFee);
        this.monthlyTransactionLimit = monthlyTransactionLimit;
    }   
    //overriden methods
    @Override
    public void deposit(double amount){
        super.setAmount(super.getAmount()+amount);
        System.out.println(amount+" has been succesfully depositted in your currentAccount...");
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
    public double getMonthlyTransactionLimit(){
        return this.monthlyTransactionLimit;
    }

    @Override
    public double getTransactionFee() {
        return super.getTransactionFee();
    }
    //setters

    public void setMonthlyTransactionLimit(double monthlyTransactionLimit) {
        this.monthlyTransactionLimit = monthlyTransactionLimit;
    }

    @Override
    public void setTransactionFee(double transactionFee) {
        super.setTransactionFee(transactionFee); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

  
    
}
