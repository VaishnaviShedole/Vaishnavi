/* 
 2.Write a program to convert LinkedList to ArrayList?
 */
import java.util.*;
public class LinkedLisr_to_ArrayList {
public static void main(String[] args) {
  LinkedList ll = new LinkedList();
    ll.add(10);
	ll.add(20);
	ll.add(30);
    ll.add(40);
    ll.add(50);
	System.out.println("printing linkedlist\n" + ll);
	ArrayList al = new ArrayList(ll);
	System.out.println("printing arraylist\n" + al);
}
}
