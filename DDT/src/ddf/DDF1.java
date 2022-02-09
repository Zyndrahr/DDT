package ddf;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDF1
{
	XSSFWorkbook wb;
	XSSFSheet sh;
	
	public DDF1(String datadriventest) throws IOException
	{
       File f = new File(datadriventest);
       FileInputStream fs = new FileInputStream(f);
       wb = new XSSFWorkbook(fs); 
       
	}
	
	public int rowcount(int index) 
	{
		int row = wb.getSheetAt(index).getLastRowNum();
		row++;
		return row;
	
	}
	
	public String getdata(int shno,int row,int col)
	
	{
		String data = wb.getSheetAt(shno).getRow(row).getCell(col).getStringCellValue();
		return data;
		
	}
	
}
