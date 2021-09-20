/*
11. Display all the properties of running threads. Create 3 threads and rename thread1 to "yourName" and make this thread a daemon thread.
Get the updated thread details.
*/
public class Vaishnavi extends Thread{
	public void run(){
	System.out.println("Daemon Thread");
	if(Thread.currentThread().isDaemon()){
		System.out.println("Daemon Thread");
	}
	else{
		System.out.println("...");
	}
}
	public static void main(String args[]){
		Vaishnavi v = new Vaishnavi();
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		v.setDaemon(true);
		v.start();
		t1.start();
		t2.start();
	}
}
