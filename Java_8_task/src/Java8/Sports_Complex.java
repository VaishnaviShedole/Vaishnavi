package Java8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Sports_Complex {
	static int slot ;
	static String name;
	static String sport;
	static List<Transaction> transactionList = new ArrayList();
	static Scanner sc = new Scanner(System.in);
	
	public static void m(){
		System.out.println("Enter your name");
		name = sc.next();
	}

	public static void SelectSports() {
		System.out.println("\nSelect your sport");
		System.out.println("\n1.Badminton Court\n2.FootBall\n3.BoxCricket\n4.Exit");
		int i = sc.nextInt();
		switch (i) {
		case 1:
			sport="badminton";
			badminton();
			
			break;
		case 2:
			sport="footBall";
			footBall();
			break;
		case 3:
			sport="boxCricket";
			boxCricket();
			break;
		case 4:
			m1();
			try {
				create();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.exit(0);
			break;
		default:
			System.out.println("Invalid choice");
		}
	}

	static Map<Integer, String> badmintonSlots = new HashMap<Integer, String>();
	public static void badminton() {
		System.out.println("Please select available slot for booking");
		badmintonSlots.forEach((K, V) -> System.out.println(K + " " + V));
		slot = sc.nextInt();
		if (badmintonSlots.get(slot) != null) {
			System.out.println(name + " your booking is successful!! "+ "\nyour slot timing is " + badmintonSlots.get(slot));
			transactionList.add(new Transaction(name,sport,slot,badmintonSlots.get(slot)));
			System.out.println(transactionList);
			badmintonSlots.remove(slot);
			System.out.println("enter 1 for new booking");
			System.out.println("enetr 0 for sports list");
			System.out.println("enter  any key for exit");
			int n = sc.nextInt();
			if (n == 1) {
				badminton();
			} else if (n == 0) {
				SelectSports();
			}else
			{
				m1();
				System.exit(0);
			}
		} else {
			System.out.println("slots are already booked!!");
		} 
}
	

	static Map<Integer, String> footballSlots = new HashMap<Integer, String>();

	public static void footBall() {
		footballSlots.forEach((K, V) -> System.out.println(K + " " + V));
		System.out.println("Please select available slot for booking ");
		slot = sc.nextInt();
		if (footballSlots.get(slot) != null) {
			System.out.println(name + " your booking is successful!!\n"+ "your slot timing is " + footballSlots.get(slot));
			transactionList.add(new Transaction(name,sport,slot,footballSlots.get(slot)));
			System.out.println(transactionList);
			System.out.println();
			footballSlots.remove(slot);
			System.out.println("enter 1 for new booking");
			System.out.println("enter 0 for sports list");
			System.out.println("enter  any key for exit");
			int n = sc.nextInt();
			if (n == 1) {
				footBall();
			} else if (n == 0) {
				SelectSports();
			}else{
				m1();
				System.exit(0);
			}
		} else {
			System.out.println("slots are already booked");
		}
	}

	static Map<Integer, String> boxCricketSlots = new HashMap<Integer, String>();

	public static void boxCricket() {
		boxCricketSlots.forEach((k, v) -> System.out.println(k + " " + v));
		System.out.println("Please select available slot for booking");
		slot = sc.nextInt();
		if (boxCricketSlots.get(slot) != null) {
			System.out.println(name + " your booking is successfull!!\n"+ "your slot timing is " + boxCricketSlots.get(slot));
			transactionList.add(new Transaction(name , sport , slot ,boxCricketSlots.get(slot)));
			System.out.println(transactionList);
			boxCricketSlots.remove(slot);
			System.out.println("enter 1 for new booking");
			System.out.println("enter 0 for sports List");
			System.out.println("enter  any key for exit");
			int n1 = sc.nextInt();
			if (n1 == 1) {
				boxCricket();
			} else if (n1 == 0) {
				SelectSports();		
			}else{
				m1();
				System.exit(0);
			}
		    
        }else{
        	System.out.println("slots are already booked");
        }
	}
	
	public static void m1(){
		
		Iterator i = transactionList.iterator();
	    while(i.hasNext()){
		  System.out.println(i.next());
	    }
	   
	}
	public static void create() throws IOException{
		 File f = new File("Sports.xls");
		    f.createNewFile();
		    System.out.println(f.getAbsolutePath());

		    FileWriter fw = new FileWriter("Sports.xls");
		    BufferedWriter bw = new BufferedWriter(fw);
		    PrintWriter pw = new PrintWriter(bw);
		    String s = transactionList.toString();
		    pw.write(s);
		    pw.flush();
		    pw.close();
		    
	}
}


/*

Problem statement
Create a application to book slots at a Sports complex
1. On load create data 
 A. Badminton court - 10 slots each with timings against each ( 1 hour per each slot)
B. Football slots - 20 slots (30 mins for each slot)
C. Box cricket -5 slots ( 2 hours each) 2. User needs to enter his/her name
3. Show the list of sports
4. Maintain the timing slots against each sport in other list.
5. Once user gives input of which sport he/she wants on the next step show the sport name and available slots.
6. Once the user selects a slot and enters the data , show a success message with his booking details and delete the slot record from the list.
7. Then when they hit enter again ask for new user details until the data is empty / program is terminated
8.The booking details need to be store in excel file
 like 1

*/