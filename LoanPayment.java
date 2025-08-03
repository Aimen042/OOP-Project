package bank;
import java.util.ArrayList;
public class LoanPayment{
    
   private String ID;
   private String contact;
   private boolean isOverDue = false;
   private ArrayList<LoanIssuance> loanslist = new ArrayList<LoanIssuance>(); 

   //Constructors;
    public LoanPayment() {
    }

    public LoanPayment(String ID, String contact) {
        this.ID = ID;
        this.contact = contact;
    }
    
    //Setters;
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    //Getters;
    public String getID() {
        return ID;
    }

    public String getContact() {
        return contact;
    }
    
    
   //Methods;
   public void addLoan(LoanIssuance loans){
       loanslist.add(loans);
   }
    
   public void loanHistory(){
       for(LoanIssuance loans : loanslist){
           System.out.println("Borrower's ID: " + loans.getBorrowedID());
           System.out.println("Loan Amount: " + loans.getLoanAmount());
           System.out.println("Loan Period: " + loans.getMonths());
           System.out.println("Total Payment: " + loans.getTotalPayment());
           System.out.println("Due Date: " + loans.getDueDate());
           if(loans.getTotalPayment() < loans.getAmountPerMonth() * loans.getMonths()){
           isOverDue = true;
           System.out.println("Overdue Cleared !");
           }
           else{
           System.out.println("Payments are overdue");
           }
       }
   }
   
   
   public void loanPayment(LoanIssuance loan){
       System.out.println("Enter borrower's ID: " + ID);
       System.out.println("Enter your phone number: " + contact);
       if(ID.equals(loan.getBorrowedID())){
           System.out.println("Check loan history ");
           loanHistory();
           if(isOverDue == true){
               System.out.println("Enter the amount you want to pay: " + loan.getAmountPerMonth());
           }
           else{
               System.out.println("Clear your previous dues !");
           }
       }
   }

   
}
