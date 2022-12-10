package practice;

public class Gen {
private int n;

synchronized public void produce(int n) {
	this.n=n;
	System.out.println("produce " + n);
	
}
synchronized public void consume(int n) {
	this.n=n;
	System.out.println("consume " + n);
	
}



}
