package Java8;
import java.awt.List;
import java.util.ArrayList;
import java.util.function.Consumer;
public class ConsumerInterface1 {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
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
     Consumer<ArrayList<Integer>> c = list1 -> al.stream()
			.filter(a -> a!=3 && a!=7)
			.forEach(b ->System.out.println(b));
            c.accept(al);
}      
}
/*
24. Using Consumer Interface,print stream of integers ranging from 1 to 10 and make sure to neglect numbers between 3 and 7.
*/