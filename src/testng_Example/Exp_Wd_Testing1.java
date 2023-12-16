package testng_Example;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Exp_Wd_Testing1 {
     WebDriver driver;
@BeforeClass
public void startUp() {
	driver = new ChromeDriver();
}
@AfterClass
public void tearDown() {
	driver.quit();
}
@Test
public void tc001() throws BiffException, IOException, InterruptedException {
	//Excel
	FileInputStream file = new FileInputStream("C:\\Exp_Excel\\HRMS_un_pw.xls");
	Workbook wb = Workbook.getWorkbook(file);
	Sheet st = wb.getSheet("Sheet1");
	String username = st.getCell(0, 1).getContents();
	String password = st.getCell(1, 1).getContents();
	Reporter.log(username);
	Reporter.log(password);
	
	//Application
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Reporter.log("Application Opened");//html report
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	Reporter.log("Login completed");
	driver.findElement(By.linkText("Logout")).click();
	Reporter.log("Logout completed");
	System.out.println("Logout completed");
}
}
