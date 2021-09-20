
public class A1 extends Thread{
public void run(){
	System.out.println("second thread starts");
	for(int i=0; i<=5; i++){
		System.out.println(i);
		try{
			A1.sleep(500);
		}catch(Exception e){
			
		}
	}
	System.out.println("Thread A1 ends");
}
}
