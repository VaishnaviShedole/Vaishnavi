import java.util.Scanner;
public class Test_pojo {
	public static void main(String[] args) throws InvalidEmployeeDetails{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of employees");
		int i = sc.nextInt();
		for( i=1; i<4; i++){
		System.out.println("Enter emp details");
		System.out.println("Enter the name of employee");
		String name = sc.next();
		System.out.println("Enter the address of employee");
		String address = sc.next();
		System.out.println("Enter id of employee");
		int id = sc.nextInt();
		InvalidEmpDetails obj1 = new InvalidEmpDetails();
		obj1.emp_details(name , address , id);
		}
		System.out.println("Enter the employee id");
		int emp_id = sc.nextInt();
		if(emp_id > 3){
			 throw new InvalidEmployeeDetails("Given employee id is not found");	
		}else
		{ 
		       System.out.println("Welcome to office");   	
	    }
}
}