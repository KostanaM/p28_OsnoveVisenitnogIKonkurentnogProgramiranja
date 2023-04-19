package kostana.maksic;
//Nit se moze napraviti i kada klasu Thread prosirite novom klasom, a zatim
//napravite instancu te klase.

//Nova klasa mora da redefinise metodu run()

public class A  extends Thread {
	
	A(String s){
		super(s);  // poziva se konstuktor Thread sledeceg oblika:
					// public Thread (String imeNiti)
	}
	
	public void run() {
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(getName());
		}

	}
}