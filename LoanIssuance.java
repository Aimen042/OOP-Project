package bank;

public class LoanIssuance{
    
    private String borrowedID;
    private double loanAmount;
    private double interestRate = 0.0;
    private int months;
    private double totalPayment = 0.0;
    private double amountPerMonth = 0.0;
    private String dueDate;
    
    //Constructors;
    public LoanIssuance() {
        
    }

    public LoanIssuance(String borrowedID, double loanAmount, double interestRate, int months, double amountPerMonth, String dueDate) {
        this.borrowedID = borrowedID;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.months = months;
        this.amountPerMonth = amountPerMonth;
        this.dueDate = dueDate;
    }
    
    //Setters;
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }


    public void setBorrowedID(String borrowedID) {
        this.borrowedID = borrowedID;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    
    //Getters;
    public double getLoanAmount() {
        return loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getMonths() {
        return months;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public String getBorrowedID() {
        return borrowedID;
    }

    public String getDueDate() {
        return dueDate;
    }
    public double getAmountPerMonth() {
        return amountPerMonth;
    }
    
   
    
}
