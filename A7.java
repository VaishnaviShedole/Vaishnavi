
import java.util.Scanner;
public class A7 {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number of rows");
	int n = sc.nextInt();
	System.out.println("enter the number of columns ");
	int m = sc.nextInt();
	int a[][] = new int[n][m];
	System.out.println("enter the array elements");
	for(int i=0;i<=a.length-1;i++){
		for(int j=0;j<=a.length-1;j++){
			a[i][j] = sc.nextInt();
		}
		System.out.println();
	}
	for(int i=0;i<=a.length-1;i++){
		int sum = 0;
		for(int j=0;j<=a.length-1;j++)
		{
			sum = sum + a[i][j];
		}
	System.out.println(sum);
	}
}
}

/*
Write code for calculating row-wise sum of array of size 3 X 3

Define the following method

Name of Method	: getRowSum() // accepts 2-D array and return 1-D array contains row-wise sum 
Argument		: int[][]
Return type		: int[]

Input: array has the following elements

1 2 3
1 2 3
1 2 3 

Output: array should contain following elements

6 6 6
*/