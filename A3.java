import java.util.Scanner;
public class A3 {
public static void main(String[] args){
   int count = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of array");
	int n = sc.nextInt();
	System.out.println("Enter array elements");
	int a[] = new int[n];
	int i=0;
	for(; i<=a.length-1; i++){
		a[i] = sc.nextInt();
	}
	for( i=0; i<=a.length-1; i++){
     System.out.print(a[i]);
	}
	System.out.println("\nenter the element to count the occurence");
    int x = sc.nextInt();
    for(i=0; i<=a.length-1; i++){
       	if(a[i]==x){
    		count++;
    	}
    }
    System.out.println(x +" occures "+ count++ + " times ");
}
}
/*
 Define the method which accepts two integer arguments, an integer array and integer value, which return the number of time the given value exist in the array.

Note: The elements in an array can be negative

Name of Method: getCount() // Which returns the number of time the given value exist in the array.
Arugments: Two arguments of an integer array and integer value to search
Return Type: an integer value
*/
