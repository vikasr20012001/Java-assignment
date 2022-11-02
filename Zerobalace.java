package mypac;

public class Zerobalace extends Exception {

	  private double currBal;
	    private double withAmt;
	    private int acctno;
	    
	    
	    public Zerobalace (double currBal, double withAmt, int acctno) {
	        super();
	        this.currBal = currBal;
	        this.withAmt = withAmt;
	        this.acctno = acctno;
	    }


		@Override
		public String toString() {
			return "Zerobalace [currBal=" + currBal + ", withAmt=" + withAmt + ", acctno=" + acctno + "]";
		}

	   

		
	    
	 

}
