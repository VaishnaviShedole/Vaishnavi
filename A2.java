import java.util.Scanner;
import java.util.Scanner;
public class A2 {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of array ");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("enter array elements");
    for(int i=0;i<=a.length-1; i++){
	a[i] = sc.nextInt();
    }
    System.out.println("enter element to get multiplied");
    int e = sc.nextInt();
    for(int i=1; i<=a.length; i++)
    {
    	int mul = e * i;
    	System.out.println(mul);
    }
    
 }
}

/*
Implement logic for the following method 

public static int[] getMultiplesArray(int number). 

This method should create a new integer array of size 10 and fill it with the multiples (multiples 1 to 10) of the given number. 
and return the array.
*/