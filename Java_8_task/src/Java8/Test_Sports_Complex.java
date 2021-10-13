package Java8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;

public class Test_Sports_Complex extends Sports_Complex{
	public static void main(String[] args) throws IOException {
		System.out.println("Wellcome to sports complex!!");
		m();
		
		badmintonSlots.put(1 , "7:00Am - 8:00Am");
		badmintonSlots.put(2 , "8:00AM - 9:00Am");
		badmintonSlots.put(3 , "9:00AM - 10:00AM");
		badmintonSlots.put(4 , "10:00AM - 11:00AM");
		badmintonSlots.put(5 , "11:00AM - 12:00PM");
		badmintonSlots.put(6 , "12:00PM - 01:00PM");
		badmintonSlots.put(7 , "01:00PM - 02:00PM");
		badmintonSlots.put(8 , "02:00PM - 03:00PM");
		badmintonSlots.put(9 , "03:00PM - 04:00PM");
		badmintonSlots.put(10, "04:00PM - 05:00PM");
		
		footballSlots.put(1 , "7:00AM - 7:30AM");
		footballSlots.put(2 , "7:30AM - 8:00AM");
		footballSlots.put(3 , "8:00AM - 08:30AM");
		footballSlots.put(4 , "8:30AM - 9:00AM");
		footballSlots.put(5 , "9:00AM - 9:30AM");
		footballSlots.put(6 , "9:30AM - 10:00AM");
		footballSlots.put(7 , "10:00AM - 10:30AM");
		footballSlots.put(8 , "10:30AM - 11:00AM");
		footballSlots.put(9 , "11:00AM - 11:30AM");
		footballSlots.put(10 , "11:30AM - 12:00PM");
		footballSlots.put(11 , "12:00PM - 12:30PM");
		footballSlots.put(12 , "12:30PM - 01:00PM");
		footballSlots.put(13 , "01:00PM - 01:30PM");
		footballSlots.put(14 , "01:30PM - 02:00PM");
		footballSlots.put(15 , "02:00PM - 02:30PM");
		footballSlots.put(16 , "02:30PM - 03:00PM");
		footballSlots.put(17 , "03:00PM - 03:30PM");
		footballSlots.put(18 , "03:30PM - 04:00PM");
		footballSlots.put(19 , "04:00PM - 04:30PM");
		footballSlots.put(20 , "04:30PM - 05:00PM");
		
		boxCricketSlots.put(1 , "7:00AM - 9:00AM");
		boxCricketSlots.put(2 , "9:00AM - 11:00AM");
		boxCricketSlots.put(3 , "11:00AM - 01:00PM");
		boxCricketSlots.put(4 , "01:00PM - 03:00PM");
		boxCricketSlots.put(5 , "03:00PM - 05:00PM");
		
		SelectSports();	
	}	
}
