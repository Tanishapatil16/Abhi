package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class simple1 {

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\Aa\\Desktop\\Excel.xlsx");
		//Workbook workbook = WorkbookFactory.create(file);
		//System.out.println(workbook.getNumberOfSheets());
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		 int sheets = workbook.getNumberOfSheets();
		 
		 
		
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
					String name = sheet.getSheetName();	
					System.out.println(name);
					
					Iterator<Row> rows = sheet.iterator(); //get rows of sheet
					//rows has ability to iterate through each and evevry row of sheet
					
					Row FirstRow = rows.next();           //get 1st row access
					Iterator<Cell> ce = FirstRow.cellIterator(); //get cell innn rows
					
					int k=0;
					int coloumn=0;
					while(ce.hasNext())
					{
						Cell cellvalue = ce.next();
						if(cellvalue.getStringCellValue().equalsIgnoreCase("Students"))
						{
							coloumn=k;
						}
						k++;
					}
					System.out.println(coloumn);
					
					//////////////////////////////////////
					
					while(rows.hasNext())
					{
						Row R = rows.next();
						if(R.getCell(coloumn).getStringCellValue().equalsIgnoreCase("Tanu"))
						{
							Iterator<Cell> value = R.cellIterator();
							while(value.hasNext())
							{
								System.out.println(value.next().getStringCellValue());
							}
							
						}
						
					}
			}
		}
		
		  
		
		

	}

}
