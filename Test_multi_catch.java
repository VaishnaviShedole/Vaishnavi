import java.util.*;
public class Test_multi_catch {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    Multi_catch obj = new Multi_catch();
    int i;
    String s = null;
    System.out.println("enter the number of employees");
    int n = sc.nextInt();
    for( i=0; i<n-1;i++)
    {
    System.out.println("enter the employee name");
     String name = sc.next();
     System.out.println("enter the employee Addess");
     String address = sc.next();
   }
   try
   { 
	System.out.println("enter an employee id");
	int id = sc.nextInt();
   }catch(Exception e)
    {
    	System.out.println("expecting an integer"+ e);
    }
}
}
