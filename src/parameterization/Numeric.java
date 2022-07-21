package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Numeric {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Aa\\Desktop\\Screenshot\\Book1.xlsx");
		double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(data);

	}

}
