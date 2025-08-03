package Bank;

abstract public class Account {
    //attributes
    private String userName,accountType;
    private int accountNumber;
    private double amount;
    private double transactionFee;
    //abstracted methods
    abstract protected void deposit(double amount);
    abstract protected void withdraw(double amount);
    abstract protected void checkBalance();
    //constructors

    public Account() {
    }

    public Account(String userName, String accountType, int accountNumber, double amount,double transactionFee) {
        this.userName = userName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionFee = transactionFee;
    }
    
    //getters
    
    public double getTransactionFee() {
        return transactionFee;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getUserName() {
        return userName;
    }

    public double getAmount() {
        return amount;
    }

    //setters

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    

    
}
