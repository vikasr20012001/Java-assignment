package practice;



	public class Ano extends Thread {
		Gen d;
		Ano(Gen d){
			this.d=d;
		}
		
		public void run() {
			int i=1;
			while (true) {
				this.d.produce(i);
				try {
				Thread.sleep(1000);}
				catch (Exception e) {
					// TODO: handle exception
				}
				i++;
			}
		}
		

	}


