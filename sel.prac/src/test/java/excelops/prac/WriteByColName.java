package excelops.prac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteByColName
{

	public static void main(String[] args) throws Exception
	{
		File a = new File("C:\\Users\\Yashwanth\\OneDrive\\Desktop\\Course Documents\\Excel Practice Files\\testdata1.xlsx");
		
		FileInputStream readfile = new FileInputStream(a);
		
		XSSFWorkbook wb = new XSSFWorkbook(readfile);
		
		XSSFSheet sheet = wb.getSheet("login");
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell;
		
		int cellindex = 0;
		
		for(int i = 0; i < row.getLastCellNum(); i++)
		{
			if(row.getCell(i).getStringCellValue().equalsIgnoreCase("Result"))
			{
				cellindex = i;
			}
		}
		
		row = sheet.getRow(3);
		
		cell = row.getCell(cellindex);
		
		cell.setCellValue("Passed");
		
		FileOutputStream writefile = new FileOutputStream(a);
		
		wb.write(writefile);
		
	}

}
