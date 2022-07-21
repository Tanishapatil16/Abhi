package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sheet3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Aa\\Desktop\\Screenshot\\V22.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(1).getBooleanCellValue());
		System.out.println(sheet.getRow(0).getCell(2).getNumericCellValue());
		

	}

}
