package kostana.maksic;

public class A implements Runnable   {
	
	public void run() {
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
		
	} 
	

}
