
import java.util.Scanner;
public class A8 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j;
		int a[][] = new int[3][3];
		System.out.println("Enter array elements");
		for( i=0; i<=a.length-1; i++){
			for( j=0; j<=a.length-1; j++){
				a[i][j] = sc.nextInt();
			}
		}
		for(i=0;i<=a.length-1;i++){
           int sum = 0;
			for( j=0;j<=a.length-1;j++)
			{
			sum = sum + a[j][i];
			}	
			
				System.out.println(sum);
			
		}
	}
	
}
/*
Write a method for calculating column-wise sum of array of size 3 X 3

Define the following method

Name of Method	: getColumnSum() // accepts 2-D array and returns 1-D array containing column-wise sum
Arguments		: int[][]
Return type		: int[]

Input: array has the following elements

1 2 3
1 2 3
1 2 3 

Output: array should contain following elements

3 6 9
*/