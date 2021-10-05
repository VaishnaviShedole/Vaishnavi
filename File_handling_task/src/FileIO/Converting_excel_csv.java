package FileIO;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class Converting_excel_csv 
{
	public static void main(String[] args) throws IOException {
		ArrayList arrList = null;
		ArrayList al = null;
		File f = new File("excel.xls");
		f.createNewFile();
		FileWriter fw = new FileWriter(f);
		fw.write("Name  ");
		fw.write("id   ");
		fw.write("salary");
		fw.close();
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(f.getAbsolutePath());
	    
	    int count = 0;
	    String thisLine;
	    FileInputStream fi = new FileInputStream(f);
	    DataInputStream di = new DataInputStream(fi);
	    int i = 0;
	    arrList = new ArrayList();
	    
	    while((thisLine = di.readLine()) != null)
	    {
	      al = new ArrayList();
	      String strar[] = thisLine.split(",");
	      for(int j=0;j<strar.length;j++)
	      {
	          al.add(strar[j]);
	      }
	      arrList.add(al);
	      System.out.println();
	      i++;
	    }
	    
	    try
	    {
	        HSSFWorkbook hwb = new HSSFWorkbook();
	        HSSFSheet sheet = hwb.createSheet("new sheet");
	        for(int k=0;k<arrList.size();k++)
	        {
	            ArrayList ardata = (ArrayList)arrList.get(k);
	            HSSFRow row = sheet.createRow((short) 0+k);
	            for(int p=0;p<ardata.size();p++)
	            {
	                HSSFCell cell = row.createCell((short) p);
	                String data = ardata.get(p).toString();
	                if(data.startsWith("=")){
	                    cell.setCellType(Cell.CELL_TYPE_STRING);
	                    data=data.replaceAll("\"", "");
	                    data=data.replaceAll("=", "");
	                    cell.setCellValue(data);
	                }else if(data.startsWith("\"")){
	                    data=data.replaceAll("\"", "");
	                    cell.setCellType(Cell.CELL_TYPE_STRING);
	                    cell.setCellValue(data);
	                }else{
	                    data=data.replaceAll("\"", "");
	                    cell.setCellType(Cell.CELL_TYPE_NUMERIC);
	                    cell.setCellValue(data);
	                }
	               
	            }
	            System.out.println();
	        }
	        FileOutputStream fileOut = new FileOutputStream("CSV.csv");
	        hwb.write(fileOut);
	        fileOut.close();
	        System.out.println("Your excel file has been generated");
	    } catch ( Exception ex ) {
	        ex.printStackTrace();
	    } 
	}
}

