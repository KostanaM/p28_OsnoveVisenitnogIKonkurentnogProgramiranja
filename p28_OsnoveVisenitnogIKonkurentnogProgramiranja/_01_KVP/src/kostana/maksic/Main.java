package kostana.maksic;

public class Main {

	public static void main(String[] args) {
		
	// Prilikom pokretanja Java programa, jedna programska nit odmah počinje da se izvrsava
	//To je glavna ili inicijalna nit
	//Upravljanje glavnom niti radi se preko objekta tipa Thread, pozivom metode 
	//currentThread() klase Thread
	
		
	Thread t = Thread.currentThread(); //referenca na trenutnu nit t
		
	System.out.println("Trenutna nit: " + t);
	
	//getName() - vraca ime niti
	System.out.println("Naziv niti: " + Thread.currentThread().getName());
	
	//getPriority() - vraca prioritet niti
	System.out.println("Prioritet niti: " + Thread.currentThread().getPriority());
	
	//[main,5,main] ili [ime niti, prioritet, ime grupe kojoj pripada nit]
	//1-podrazumevano ime glavne niti je main. 
	//2-Njen priorite je 5, sto je tagođer podrazumevana vrednost.
	//3-main je ime grupe niti kojoj ta nit pripada
	//grupa niti je struktura podataka koja upravlja stanjem kolekcije niti kao celinom
	
	
		
	}

}
