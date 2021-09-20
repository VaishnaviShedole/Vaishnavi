import java.util.Scanner;
public class A4 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array ");
    int n = sc.nextInt();
    int a[] = new int[n];
    int i ;
    for( i=0 ; i<=a.length-1; i++ ){
    	a[i] = sc.nextInt();
    }
    System.out.println("the odd numbers are");
int count = 0;
for(i=0; i<=a.length-1; i++){
       	if(a[i] % 2 != 0){
       		count = count + 1;
       	}
}
       	System.out.print(count);
       	
    
  }
}

	/*
Define a  method that counts and returns the number of odd numbers from given input arrray

Write the method with following specifications

Name of method : getOddCount
Arguments : One Integer Array 
Return Type :int

Example :
	input :  { 1,2,3,4,5 }
	output : 3
*/ 