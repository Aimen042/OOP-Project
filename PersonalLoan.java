
package bank;

public class PersonalLoan extends Loan {
    
    private int contact;
    private String borrowedID;
    private double loanAmount;
    private double interestRate = 0.0;
    private int months;
    private double totalPayment = 0.0;
    private double amountPerMonth = 0.0;
    private String dueDate;
    
    //Constructors;
    public PersonalLoan() {
        
    }

    public PersonalLoan(int contact,String borrowedID, double loanAmount, double interestRate, int months, int creditScore, int monthlyIncome, double amountPerMonth, String dueDate) {
        super(creditScore, monthlyIncome);
        this.contact = contact;
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

    public void setContact(int contact) {
        this.contact = contact;
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

    public int getContact() {
        return contact;
    }
    
    
    @Override
    public void calculateAmount(){
        
        //Formula applied for calculating interest rate is:
        //Interest Rate = Kibor Rates(09-January-2024) + Lender's Spread;
        //Lender's Spread = Margin a bank kept;
            
        if (months == 3){
            interestRate = 0.213 + 0.03;
            totalPayment = loanAmount * months * interestRate;
            System.out.println("Total Amount: " + totalPayment);
            amountPerMonth = totalPayment / months;
            System.out.println("Amount per Month: " + amountPerMonth);
            System.out.println("Due Date: " + dueDate);
        }
        else if(months == 9){
            interestRate = 0.216 + 0.05;
            totalPayment = loanAmount * months * interestRate;
            System.out.println("Total Amount: " + totalPayment);
            amountPerMonth = totalPayment / months;
            System.out.println("Amount per Month: " + amountPerMonth);
            System.out.println("Due Date: " + dueDate);
        }
        else if(months == 12){
            interestRate = 0.216 + 0.07;
            totalPayment = loanAmount * months * interestRate;
            System.out.println("Total Amount: " + totalPayment);
            amountPerMonth = totalPayment / months;
            System.out.println("Amount per Month: " + amountPerMonth);
            System.out.println("Due Date: " + dueDate);
        }
        else{
            System.out.println("Not applicable for this period of time");
        }
    }
}
