package excelops.prac;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadByColName
{

	public static void main(String[] args) throws Exception
	{
		File a = new File("C:\\Users\\Yashwanth\\OneDrive\\Desktop\\Course Documents\\Excel Practice Files\\testdata1.xlsx");
		
		FileInputStream readfile = new FileInputStream(a);
		
		XSSFWorkbook wb = new XSSFWorkbook(readfile);
		
		XSSFSheet s = wb.getSheet("login");
		
		XSSFRow r = s.getRow(0);
		
		XSSFCell c;
		
		int cellindex = 0;
		
		for(int i = 0; i < r.getLastCellNum(); i++)
		{
			if(r.getCell(i).getStringCellValue().equalsIgnoreCase("DateCreated"))
			{
				cellindex = i;
			}
		}
		
		r = s.getRow(1);
		
		c = r.getCell(cellindex);
		
		String targetval = c.getStringCellValue();
		
		System.out.println(targetval);
		
		wb.close();
		
		readfile.close();
		
	}

}
