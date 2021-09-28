/*
  5 Write a program to iterate TreeMap in java?
 */
import java.util.*;
public class Iterating_a_TreeMap {
public static void main(String[] args) {
	TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
	tm.put("abc",1);
	tm.put("def", 2);
	tm.put("ghi", 3);
	tm.put("jkl", 4);
	System.out.println(tm);
	Set s = tm.entrySet();
	for(Map.Entry<String,Integer> m : tm.entrySet()){
		System.out.println(" key " + m.getKey() + " values " +m.getValue());
	}
}
}
