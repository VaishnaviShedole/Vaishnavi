
public class A2 {
public static void main(String args[]){
	A a = new A();
	A1 a1 = new A1();
	a.start();
	a1.yield();
	try{
		a.sleep(1000);
	}catch(Exception e){
		
	}
	a1.start();
}
}
