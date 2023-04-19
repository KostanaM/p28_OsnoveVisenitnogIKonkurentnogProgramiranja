package kostana.maksic;

public class Main {

	public static void main(String[] args) {
		
		A a = new A("Thread");
		B b = new B("Gewinde");
		C c = new C("Fil");
		
		a.start(); 
		b.start();
		c.start();
		
	}

}
