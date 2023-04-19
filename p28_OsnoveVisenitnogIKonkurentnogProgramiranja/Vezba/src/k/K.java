package k;

public class K implements Runnable {
String s;
Thread t;




	public K(String s) {
	this.s = s;
	t = new Thread(this, s);
	t.start();
}

	public void run() {
		for(int i = 0; i<=5; i++)
			System.out.println("S" + s);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Nit je prekinuta");
		}
		i++;

	}
}
}