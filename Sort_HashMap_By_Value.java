/*
 6.Write a program to sort HashMap by value?
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Sort_HashMap_By_Value {
	static HashMap<Integer,String> hm ;
	static LinkedHashMap<Integer,String> ll;
	static ArrayList<Map.Entry<Integer,String>> arr;
	
	public void sort(){
		for(Map.Entry<Integer, String> e : hm.entrySet()){
			arr.add(e);
		}
		Comparator<Map.Entry<Integer, String>> valueComparator = new Comparator<Map.Entry<Integer, String>>() {
			public int compare(Map.Entry<Integer,String> e1, Map.Entry<Integer,String> e2) {
                String v1 = e1.getValue();
                String v2 = e2.getValue();
                return v1.compareTo(v2);
            }
	
		};
		Collections.sort(arr, valueComparator);
		for(Map.Entry<Integer, String> e: arr) {
			ll.put(e.getKey(), e.getValue());
			System.out.println(e.getValue());
		}
	}
	Sort_HashMap_By_Value() {
		hm = new HashMap<>();
		hm.put(10, "d");
		hm.put(20, "c");
		hm.put(30, "b");
		hm.put(40, "a");

	 ll = new LinkedHashMap<>();
	    arr = new ArrayList<>();
	}
	 public static void main(String[] args) {
			Sort_HashMap_By_Value m = new Sort_HashMap_By_Value();
			System.out.println("sorting hashmap by values");
			m.sort();
		}
}
