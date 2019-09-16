
public class MinhaRunnable implements Runnable{
	
	private String nome;
	
	public MinhaRunnable(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public void run() {
		
		while(true) {
			System.out.println(nome);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
