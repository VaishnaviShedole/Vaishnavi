/*
  1. perform followiing operations on array list
How to Iterate ArrayList using Java ListIterator
Arraylist add element at specific index
Sort ArrayList in descending order
insert an element to ArrayList using ListIterator
Hsort arraylist of strings alphabetically java
Sort elements of Java ArrayList
replace an element at specified index arraylist
Search an element of Java ArrayList
JRemove element from specified index ArrayList
Remove duplicates from arraylist without using collections
*/
import java.util.*;
public class Operations_on_arraylist {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(200);
	al.add(3);
	al.add(4);
	System.out.println("Iterating arraylist using list iterator");
	Iterator i = al.iterator();
    while(i.hasNext()){
	  System.out.println(i.next());
    }
    al.add(4,5);
    System.out.println("Adding elements to the arraylist"+ al);
   
    System.out.println("Sorting elements of Java ArrayList");
    Collections.sort(al);
    System.out.println(al);
    
    System.out.println("sorting arraylist in decending order");
    Collections.sort(al,Collections.reverseOrder());
    System.out.println(al);
    
    System.out.println("Adding elements to the list using iterator");
    List<String> als = new ArrayList();
    Iterator<String> it = null;
    als.add("a");
    als.add("c");
    als.add("b");
    als.add("z");
    it = als.listIterator();
    while(it.hasNext()){
    	System.out.println(it.next( ));
    }
    Collections.sort(als);
    System.out.println("sorting arraylist of strings alphabetically\n" + als);
   
    als.set(3,"d");
    System.out.println("Replacing element d at index 3" + als);
    
    System.out.println("Searching element in arraylist");
    int index = als.indexOf("b");
    System.out.println(index);
    
    System.out.println("removing array element");
    als.remove(3);
    System.out.println(als);
    
    ArrayList AL = new ArrayList();
    AL.add(10);
    AL.add(20);
    AL.add(20);
    AL.add(30);
    AL.add(40);
    HashSet s = new HashSet(AL);
    ArrayList Al = new ArrayList(s);
    System.out.println("Removing duplicates from arraylist" + Al);
    }
}
