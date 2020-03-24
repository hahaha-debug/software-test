package lab2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileInputStream;
import org.junit.*;
import org.apache.poi.ss.usermodel.*;

public class Lab {
	public WebDriver driver;
	@Before
	public void setUp(){
		String driverPath = System.getProperty("user.dir")+"\\geckodriver.exe";
		System.out.println(driverPath);
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		
	}
		
	@After
	public void After() {
		driver.close();
	}
	
	@Test
	public void Test() throws Exception{
		File file = new File(System.getProperty("user.dir")+"\\Selenium+Lab2020.xlsx");
		FileInputStream fis = null;
		fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheetAt = workbook.getSheetAt(0);
		String name,pass;
		String baseUrl = "http://103.120.226.190/selenium-demo/git-repo";
		driver.get(baseUrl);
		for(int i=0;i<20;i++) {
			name = sheetAt.getRow(i).getCell(1).getStringCellValue();
			pass = sheetAt.getRow(i).getCell(2).getStringCellValue();
			driver.findElement(By.name("user_number")).sendKeys(name);
			driver.findElement(By.name("password")).sendKeys(pass);
			driver.findElement(By.className("btn")).click();
			String pas = driver.findElements(By.tagName("code")).get(1).getText();
			assertEquals(pas,pass);
		}	
	}
}
