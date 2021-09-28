/*
 * 9 Write a program to serialize an ArrayList in java?
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class Serialize_an_ArrayList {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);
	System.out.println(al);
	try{
		System.out.println("Serializing an arraylist");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\d1\\Desktop\\Myfile.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(al);
	    oos.close();
	    fos.close();
	}catch(Exception e){
		System.out.println(e);
	}
}
}
