import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		//Input stream as argument
		
		FileInputStream fis = new FileInputStream("C:\\Users\\anil1\\Documents\\testcase.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
			
		{
			
			if(workbook.getSheetName(sheets).equalsIgnoreCase("testdata"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				Iterator<Row> rows = sheet.iterator();
				
			Row	firstRow = rows.next();
			
			Iterator<Cell> ce = firstRow.cellIterator();
			int k=0;
			int coloumn=0;
			while(ce.hasNext())
			{
				Cell value = ce.next();
				
				if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
				{
					coloumn=k;
				}
			k++;
			}
				
			}
		}

	}

}
