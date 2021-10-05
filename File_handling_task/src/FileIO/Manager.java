package FileIO;

import java.io.IOException;

public class Manager extends Employee {
public static void main(String[] args) throws IOException {
	Manager m = new Manager();
	m.create();
	m.write();
	m.read();
	m.delete();
}
}
/*
14. Employee has methods for create, read and write to a file.
Manager extends employer and have these file methods overriden(Examine here without handling the exceptions) along with delete the file.
15. Write the details of Employee class to a file in your local and make this file non-editable.
16. Convert from CSV to excel.
17. Convert from Excel to a CSV File.
*/