/*
 4 Write a program to reverse ArrayList in java?
 */
import java.util.*;
public class Reverse_an_ArrayList {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add("hi");
	al.add(40);
	al.add(50);
	System.out.println(al);
    Collections.reverse(al);
    System.out.println(al);
}
}
