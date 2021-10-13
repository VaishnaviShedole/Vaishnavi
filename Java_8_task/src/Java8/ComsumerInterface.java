package Java8;
import java.awt.List;
import java.util.ArrayList;
import java.util.function.Consumer;
public class ComsumerInterface {
public static void main(String[] args) {
	
	ArrayList<Integer> al =new ArrayList<Integer>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
	al.add(6);
	al.add(7);
	al.add(8);
	al.add(9);
	al.add(10);
	Consumer<ArrayList<Integer>> c = list->list.stream().map(a->a*2).forEach(x -> System.out.println(x));
	c.accept(al);
}
}
/*
25. Using Consumer Interface,print stream of integers ranging from 1 to 10 and double these numbers in your output.
*/