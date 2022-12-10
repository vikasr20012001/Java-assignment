package practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Gen s=new Gen();
Ano A=new Ano(s);
Thread f=new Thread(A);
f.start();
	}

}
