package kostana.maksic;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		//Kada odredjenoj niti zelite da dodate prioritet izvrsavanja, pozovite metodu
		//setPriority() koja je clan klase Thread.
		//void setPriority(nivo)
		//Parametrom "nivo" zadajete nivo prioriteta niti za koju je metoda pozvana
		//Vrednost mora biti u opsegu izmedju MIN_PRIORITY = 1 i MAX_PRIORITY = 10
		//a vrednosti tih konstanti su izmedju 1 i 10.
		//Podrazumevana vrednosti iznosi 5 a moze se zadati preko NORM_PRIORITY
		
		a.setPriority(Thread.MIN_PRIORITY + 5); // Po default-u 1 -> 6
		b.setPriority(Thread.MAX_PRIORITY - 7);// Po default-u 10 -> 3
		
		a.start();
		b.start();
				
		System.out.println("Kraj glavne niti");
	}

}
