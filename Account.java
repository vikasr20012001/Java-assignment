package mypac;
public class Account {

	
	 private String accountHolderName;
	    private int acctNo;
	    private double balance;
	    
	    
	    public Account(String accountHolderName, int acctNo, double balance) {
	        super();
	        this.accountHolderName = accountHolderName;
	        this.acctNo = acctNo;
	        this.balance = balance;
	    }

	 


	    public String getAccountHolderName() {
	        return accountHolderName;
	    }

	 


	    public void setAccountHolderName(String accountHolderName) {
	        this.accountHolderName = accountHolderName;
	    }

	 


	    public double getBalance() {
	        return balance;
	    }

	 


	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	 


	    public int getAcctNo() {
	        return acctNo;
	    }

	 

	    
	    public void deposit(double amt)
	    {
	        this.balance = this.balance + amt;
	    }
	    
	    public double withdraw(double amt) throws Zerobalace 
	    {
	        if(amt <= this.balance )
	        {
	            this.balance = this.balance - amt;
	            System.out.println("Current Balance is "+ this.balance+" after withdrawing amt: "+amt);
	        }
	     
	        else {
	        	
	        	throw new Zerobalace (this.balance, amt,this.acctNo);
	        }
	        
	        return amt;
	    }

	 

	    @Override
	    public String toString() {
	        return "Account [accountHolderName=" + accountHolderName + ", acctNo=" + acctNo + ", balance=" + balance + "]";
	    }
	    
	    
	    

	    
}
