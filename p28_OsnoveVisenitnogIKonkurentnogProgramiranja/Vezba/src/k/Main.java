package k;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		K a = new K("Nit");
		
		System.out.println(a.t.isAlive());
		a.t.join();
		System.out.println(a.t.isAlive());
	}

}
