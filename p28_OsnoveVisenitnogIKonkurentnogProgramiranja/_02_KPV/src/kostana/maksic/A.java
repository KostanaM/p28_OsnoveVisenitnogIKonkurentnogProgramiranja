package kostana.maksic;

// nit se moze napraviti za svaki objekat koji implementira interfejs Runnable
// Da bi klasa implementirala interfejs Runnable, potrebno je da samo ima metodu 
// run(), deklarisana u sledecem obliku: public void run()
// U metodi run() zadajete kod koji treba da se izvršava u novoj niti.
// Kada se izvrsi metoda run() nit se unistava

public class A  implements Runnable   {
	
	public void run() {
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	
		
		
		
	} 
	

}
