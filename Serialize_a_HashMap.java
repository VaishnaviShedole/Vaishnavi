/*
Write a program to serialize a HashMap in java?
*/
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.*;
public class Serialize_a_HashMap {
	public static void main(String[] args)
    {
        HashMap<Integer, String> hm = new HashMap<>();
        
        hm.put(1, "abc");
        hm.put(2 , "def");
        hm.put(3 , "ghi");
        hm.put(4 , "jkl");
        hm.put(5 , "mno");
        System.out.println(hm);
        try {
        	System.out.println("Serializing HashMap");
        	FileOutputStream fos = new FileOutputStream("C:\\Users\\d1\\Desktop\\abc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(hm);
			oos.close();
			fos.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
