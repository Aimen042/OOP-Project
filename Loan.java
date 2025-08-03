package bank;

abstract public class Loan {
    
    private boolean eligibility = false;
    private int creditScore;
    private int monthlyIncome;

    //Abstracted Methods;
    abstract void calculateAmount();
    //Constructors;
    public Loan() {
        
    }

    public Loan(int creditScore, int monthlyIncome) {
        this.creditScore = creditScore;
        this.monthlyIncome = monthlyIncome;
    }
    
    //Setters;
    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
    
    //Getters;
    public int getCreditScore() {
        return creditScore;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }
    
    public void loanApproval(){
        if(creditScore > 660 && monthlyIncome > 50000){
            eligibility = true;
            System.out.println("Loan approved");
        }
        else{
            System.out.println("Loan approval denied");
        }
    }
   
    
    
}
