package kostana.maksic;

public class A extends Thread {

	public void run() {
		
		int i = 1;
		
		while(i <= 10) 
		{
			System.out.println("i: " + i);
			// sleep (vrednostUMilisekundama)
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Nit je prekinuta");
			}
			i++;
		}
	}
	//sleep (milisekunde) - privremeno zaustavlja (suspenduje izvrsavanje
	// argment metode sleep() je interval cekanja u milisekundama
	
	//Metoda sleep() u klasi Thread moze da izazove izuzetak InterruptedException
	//Desice se izuzetak ukoliko neka druga nit pozeli da prekine ovu suspendovanu nit.
}