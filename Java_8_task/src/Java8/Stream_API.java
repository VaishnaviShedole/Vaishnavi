package Java8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Stream_API {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	System.out.println(al);
    long count = al.stream().count();
	System.out.println("count : " + count);
	/*
	int sum = al.stream()
			.reduce(0, Integer::sum);
	System.out.println("sum : " + sum);
	*/
	/*
	double sum=al.stream().collect(Collectors.summingDouble(j->j));
	System.out.println("sum :"+sum);
	*/
	
	int sum = al.stream().collect(Collectors.summingInt(i->i));
	System.out.println("sum :"+ sum);
	
	int min = al.stream().min(Integer::compare).get();
	System.out.println("min : "+min);
	
	int max = al.stream().max(Integer::compare).get();
	System.out.println("max : " + max);
	/*
	Double avg = (double) (sum / count);
	System.out.println("avg :" + avg);
	*/
	 Double avg = al.stream().collect(Collectors.averagingDouble(p->p));  
     System.out.println("Average : "+avg);  
    
}
}
/*
23. Perform calculations such as count,sum,min,avg,max for given input of arrayList using Stream API.
*/