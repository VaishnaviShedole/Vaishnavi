/*
  A thread has "add" operation,other thread performs"avg" and
other thread performs "display" operation which displays avg and add details after the two threads are compeletely performed.

 */
public class Add implements Runnable {
	public void run() {
		int a = 2, b = 2;
		int c = a + b;
		System.out.println("The sum of two numbers is" + c);
		Avg av = new Avg();
		av.add(c);
	}
}
