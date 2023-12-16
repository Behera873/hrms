package project_HRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		//Enter into Frame
		System.out.println("Enter inside the frame");
		driver.switchTo().frame("rightMenu");
		Select st = new Select(driver.findElement(By.name("loc_code")));
		st.selectByVisibleText("Emp. ID");
		st.selectByIndex(1);
		st.selectByValue("0");
		Thread.sleep(3000);
		driver.findElement(By.name("loc_name")).sendKeys("2379");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		//Exit Frame
		System.out.println("Exit the framessss");
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("logOut the appliction");
		driver.close();
	}

}
