
public class A9 {
		public static void main(String args[]){
			int a[][] = {{1,2,3},{1,8,3},{1,2,4}};
	    for(int i=0;i<=a.length-1;i++){
	    	for(int j=0;j<=a.length-1;j++){
	    		System.out.print(a[i][j]);
	    	}
	    	System.out.println();
	    }
	    int sum1 = 0;
	    for(int i=0;i<=a.length-1;i++){
	    
	    	for(int j=0;j<=a.length-1;j++){
	    		if(i==j){
	    			sum1 = sum1 + a[i][j];
	    		System.out.println(sum1);
	    		}
	    	}
	    }
	   System.out.println("Bottom right");
	    int sum2 = 0 ;
	    for(int i=a.length-1; i>=0; i--){
	    	int sum = 0;
	    	for(int j=a.length-1; j>=0; j--){
	    		if(i == j){
	    			sum2 = sum2 + a[i][j];
	    			System.out.println(sum2);
	    		}
	    	}
	    }
	    
	}
}

/*
Write code for calculating sum of diagonal elements(TopLeft to BottomRight) of an array of size 3 X 3.

Define the following method

Name of Method	: getDiagonalSum() // accepts 2-D array and returns the sum of diagonal elements.
Arguments		: int[][]  // A Two dimensional int array
Return type		: int 

Input: array has the following elements

1 2 3
1 8 3
1 2 4 

Output: 
13
*/