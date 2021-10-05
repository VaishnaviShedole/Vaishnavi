package FileIO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Employee {

private static File f;

public void create(){
	 f = new File("emp1.csv");
	System.out.println(f.getAbsolutePath());
    System.out.println(f.exists());
}

public void write() throws IOException{
	FileWriter fw = new FileWriter("emp1.csv");
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write("Name ");
	bw.write("id ");
	bw.write("salary");
	bw.close();
	System.out.println("end of write");
}

public void read() throws IOException{
	FileReader fr = new FileReader("emp1.csv");
	BufferedReader br = new BufferedReader(fr);
	String s = br.readLine();
	if(s != null){
		System.out.println(s);
		br.readLine();
	}
	br.close();
}
public void delete(){
	try{
	System.out.println(f.delete());
	}
	catch(NullPointerException e){
		
	}
	
}
}
