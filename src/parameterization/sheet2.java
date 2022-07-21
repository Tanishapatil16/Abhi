package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sheet2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Aa\\Desktop\\Screenshot\\V22.xlsx");
		Cell cell = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0);

		CellType Type = cell.getCellType();
		if(Type==CellType.STRING)
		{
			System.out.println(cell.getStringCellValue());
		}
		else if(Type==CellType.BOOLEAN)
		{
			System.out.println(cell.getBooleanCellValue());
		}
		else if(Type==CellType.NUMERIC)
		{
			System.out.println(cell.getNumericCellValue());
		}
		else if(Type==CellType.BLANK)
		{
			System.out.println(cell.getAddress());
		}
		}

	}


