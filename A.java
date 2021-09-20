//For any created thread, Observe the thread life cycle on each run.
public class A extends Thread{
	public void run(){
		System.out.println("Thread A");
    for(int i=0; i<=5; i++){
	    System.out.println(i);
    try{
    	A.sleep(500);
    }catch(Exception e){
    	
    }
    }
    System.out.println("End of thread A");
}
}