/*
 3 Write a program to convert HashSet to Array?
 */
import java.util.*;
public class HashSet_to_Array {
public static void main(String[] args) {
	HashSet hs = new HashSet();
	hs.add(1);
	hs.add(2);
	hs.add(3);
	hs.add(4);
	hs.add(5);
	System.out.println(hs);
    Object a[] = hs.toArray();
    System.out.println("Printing array");
    for(int i=0; i<a.length;i++){
    	System.out.println(a[i]);
    }
}
}
