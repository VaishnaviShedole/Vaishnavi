package FileIO;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Emp {
public static void main(String[] args) {
	try{
	File f = new File("E.csv");
	FileWriter fw = new FileWriter(f);
	fw.write("hello");
	fw.close();
	boolean flag = f.setReadOnly();
    flag = f.canWrite();
    System.out.println(flag);
   }
   catch(Exception e){
	   System.out.println(e);
   }
}
}
