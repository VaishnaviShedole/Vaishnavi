
public class Avg implements Runnable{
	
	public int add(int sum){
		return sum;
	}
public void run(){
	int a[] = {5,5,5,5,5};
	int sum = 0;
	for(int i=0; i<a.length; i++){
		sum = sum + a[i];
	}
	int average = sum/5;
	System.out.println("average is :" + average);
	Display d = new Display();
	d.avg(average);
	//d.display(sum, avg);
}

}
