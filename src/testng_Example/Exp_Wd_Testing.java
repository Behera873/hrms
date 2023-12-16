package testng_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_Wd_Testing {
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
   public void tc001() throws Exception{
	   driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	   Reporter.log("Application Opened");//html report
	   driver.findElement(By.name("txtUserName")).sendKeys("naresit");
	   driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	   driver.findElement(By.name("Submit")).click();
	   System.out.println("Login Completed");
	   Thread.sleep(3000);
	   Reporter.log("Logout completed");
	   System.out.println("Logout completed");
   }
}
