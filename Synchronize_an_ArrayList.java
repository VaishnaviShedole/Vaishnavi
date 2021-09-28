/*
10 How to synchronize an ArrayList in java?
*/
import java.util.*;
public class Synchronize_an_ArrayList {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);
	Collections.synchronizedList(al);
	synchronized(al){
		Iterator it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
}
