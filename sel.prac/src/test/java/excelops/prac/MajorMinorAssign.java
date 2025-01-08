package excelops.prac;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class MajorMinorAssign
{

	public static void main(String[] args) throws Exception
	{
		File agefile = new File("C:\\Users\\Yashwanth\\OneDrive\\Desktop\\Course Documents\\Excel Practice Files\\data.xlsx");

		FileInputStream readfile = new FileInputStream(agefile);
		
		XSSFWorkbook book = new XSSFWorkbook(readfile);
		
		XSSFSheet sheet = book.getSheet("people");
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell;
		
		int agecellindex = 0;
		for(int i = 0; i < row.getLastCellNum(); i++)
		{
			if(row.getCell(i).getStringCellValue().equalsIgnoreCase("age"))
			{
				agecellindex = i;	
			}	
		}
		
		row = sheet.getRow(1);
		

				
				for(int j = 0; j < sheet.getLastRowNum(); j++)
				{
				/*	if(row.getCell(i).get))
					{
						System.out.println("minor");
					}
					else
					{
						System.out.println("major");
					}*/
						
				}
			}

		
		
	
	}

