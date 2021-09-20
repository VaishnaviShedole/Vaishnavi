import java.util.Scanner;
public class A1 {
public static void findUnique(int arr[]){
	for(int i=0; i<arr.length; i++){
		boolean isUnique = false;
		for(int j=0; j<i; j++){
			if(arr[i] == arr[j]){
				isUnique = true;
				break;
			}
		}
			if(!isUnique){
			System.out.print(arr[i]);
		}
	
	}
}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of array");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("enter the array elements");
	for(int i=0; i<=n-1; i++)
	{
	   a[i] = sc.nextInt();
	}
	findUnique(a);
}
	
}



/*
Define a method which accepts an array of numbers and return the sum of unique numbers from the array.



Name of method :sumOfArray()

Arguments: one argument of type integer array

Return Type: an integer value


Example:


Input: {1, 2, 3, 2, 4, 1}

Output: 7
*/