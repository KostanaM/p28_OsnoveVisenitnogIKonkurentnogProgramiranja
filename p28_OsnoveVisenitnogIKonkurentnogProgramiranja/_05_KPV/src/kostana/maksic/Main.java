package kostana.maksic;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		Thread t1 = new Thread(a, "Thread");
		Thread t2 = new Thread(b, "Gewinde");
		Thread t3 = new Thread(c, "Fil");
		
		t1.start(); // metoda start() poziva metodu run()
		t2.start();
		t3.start();

	}

}
