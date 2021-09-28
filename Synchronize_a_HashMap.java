/* 
Write a program to synchronize a HashMap in java?
*/
import java.util.*;
public class Synchronize_a_HashMap {
public static void main(String[] args) {
	HashMap hm = new HashMap();
	hm.put(1, "value1");
	hm.put(2, "value2");
	Map m = Collections.synchronizedMap(hm);
	Set s = m.entrySet();
	synchronized (m) {
		Iterator i = s.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
}
