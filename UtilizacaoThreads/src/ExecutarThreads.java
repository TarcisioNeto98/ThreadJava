
public class ExecutarThreads {
	
	public static void main(String[] args) {
		/*new Thread(new Runnable() {//Interface dentro da classe Thread, é nescessario implementala para utilizar seus
			//métodos, como o setOnCLickListnner.
			@Override
			public void run() {
				for(int i = 0; true; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println("oi");
					try{
						Thread.sleep(1000);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}).start();*/
		
		//Uma alternativa ao modo anterior, é implementar a classe Runnable, e utiliza-lá.
		
		Thread t1 = new Thread(new MinhaRunnable("neto")), t2 = new Thread(new MinhaRunnable("tarcisio"));
		t1.start();
		t2.start();
		
	}

}
