package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Boolean {

	public static void main(String[] args) throws EncryptedDocumentException, IOException,NullPointerException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Aa\\Desktop\\Screenshot\\V22.xlsx");
		
		boolean B = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getBooleanCellValue();

		System.out.println(B);
		
		
	}

}
