package project_HRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Frame {
// This is Bug finding 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		//Enter userID & Password
		Thread.sleep(2000);
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(2000);
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("LogIN Successfull");
		Thread.sleep(2000);
		//Enter into Frames/IFrames
		driver.switchTo().frame("rightMenu");
		//Click on Add button
		driver.findElement(By.xpath("//input[@value='Add'][@type='button'][@class='plainbtn']"));
		Thread.sleep(2000);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Behera");
		Thread.sleep(2000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Subhransu");
		Thread.sleep(2000);
		driver.findElement(By.id("btnEdit")).click();
		System.out.println("Add Employee details");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		//LogOut
		driver.findElement(By.linkText("Logout"));
		System.out.println("LogOut Successfull");
		Thread.sleep(2000);
		driver.close();
	}

}
