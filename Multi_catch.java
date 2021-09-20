//Write a program for example of multiple catch statements occurring in a program
/*
 WAP on custom exception where it gives an 'Invalid Employee ID' Exception while entering into an Organization or office . 

Create a pojo class that contains Employee details including name ,id ,address .If ID is not found must give exception mesaage that "given Employee ID is not found or mismatched ,

 please enter the valid ID" and if ID is found give message as "Welcome to office". Take input from user and check the ID with the already existing Employee ids

Note; Please add multiple employee details
 */
import java.util.Scanner;
public class Multi_catch{
	String details = null;
	public void m(String name , String address , int id){
		System.out.println("Name =" + name + "\nAddress =" + address + "\nId" + id);
	}
}
