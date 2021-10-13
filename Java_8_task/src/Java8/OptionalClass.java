package Java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OptionalClass {
public static void main(String[] args) {
	// String joiner
	StringJoiner sj = new StringJoiner("-","(",")");
	sj.add("1");
    sj.add("100");
    System.out.println(sj);
    
    //collector class
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    al.add(5);
    ArrayList<Integer> newList = (ArrayList<Integer>) al.stream().filter(i -> i!=2).collect(Collectors.toList());
    System.out.println(newList);
    
    //optional class
    String str[] = new String[10];
	Optional<String> CheckNull = Optional.ofNullable(str[5]);
	if(CheckNull.isPresent()){  // check for value is present or not  
        String lowercaseString = str[5].toLowerCase();  
        System.out.print(lowercaseString);  
    }else  
        System.out.println("string value is not present");  
	
	//parallel sort
	int array[] = {2,5,3,4,1};
	System.out.println("array before sorting");
	for(int i=0;i<5;i++)
	System.out.println(array[i]);
    
	Arrays.parallelSort(array);
	System.out.println("arrays after sorting");
	for(int i=0;i<5;i++){
		System.out.println(array[i]);
	}
}
}  
/*
26. Perform handson on every methods on OptionalClass, ParallelSort, StringJoiner,Collector class in Streams.
*/