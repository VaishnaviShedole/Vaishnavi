import java.util.Scanner;
public class A5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter the size of array ");
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    System.out.println("enter the array elements");
	    int i ;
	    for( i=0 ; i<=a.length-1; i++ ){
	    	a[i] = sc.nextInt();
	    }
	    System.out.println("the size of array is " + a.length);
	int count = 0;
	    for(i=0; i<=a.length-1; i++){
       	if(a[i]% 2 != 0){
	 	
       		count = count + a[i];
	      }
    }
    System.out.print("The sum of odd numbers is " + count);
}
}
/*
Define a method that makes the sum of all odd numbers from given input array and sends integer.

Write the method with following specifications

Name of method : getOddSum
Arguments : One Integer Array 
Return Type : Integer

Example :
	input :  { 1,2,3,4,5 }
	output : 9
*/