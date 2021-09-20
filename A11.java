import java.util.Scanner;
public class A11
{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of array");
	int a = sc.nextInt();
	System.out.println("enter the array elements");
	int arr[] = new int[a];
	for(int i=0; i<a; i++){
		arr[i] = sc.nextInt();
	}
	System.out.println("Before moving the array elements are");
	for(int i=0; i<a; i++){
		System.out.print(arr[i]);
	}
	System.out.println();
	System.out.println("After moving the array elements are");{
		for(int i=arr.length-1; i>=0; i--){
			System.out.println(arr[i]);
	}
	}	
}
}
