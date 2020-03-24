package lab2;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

public class As {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("D:\\eclipsework\\lab2\\Selenium+Lab2020.xlsx");
		FileInputStream fis = null;
		fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheetAt = workbook.getSheetAt(0);
		String name,pass;
		
		for(int i=0;i<20;i++) {
			//driver.implicitly_wait(2);
			name = sheetAt.getRow(i).getCell(1).getStringCellValue();
			pass = sheetAt.getRow(i).getCell(2).getStringCellValue();
			System.out.println(name);
			System.out.println(pass);
			
		}
	}

}
