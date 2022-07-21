package parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sheet1
{

	public static void main(String[] args) throws EncryptedDocumentException,IOException,NullPointerException
	{
	FileInputStream file = new FileInputStream("C:\\Users\\Aa\\Desktop\\Screenshot\\Book1.xlsx");
	
	 String T = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
	
     System.out.println("String Is=="+T);
     
   
	}

}
