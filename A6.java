/*
Define a method that creates and returns array of numbers for a given integer as parameter.

Write the method with following specifications

Name of method : getIncreaseDecrease
Arguments : One Integer 
Return Type : int Array

Example :
	input :  5
	return array with values: {1,5,2,4,3}
	
	input : 8
	return array with values: {1,8,2,7,3,6,4,5}
	*/
import java.util.Scanner;
public class A6 {
	public static void getIncreaseDecrease(int n){
	int a[] = new int[5];
	for(int i=1;i<=n;i++){
			System.out.println(i);
	}
	}
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of n");
    int n = sc.nextInt();
    int a[] = new int[n];
   
    getIncreaseDecrease(n);
	}
}

