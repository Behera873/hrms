package project_HRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC002_varify {
	//Test Data------
	static String url="http://183.82.103.245/nareshit/login.php";
	static String username="nareshit";
	static String password="nareshit";
	static String title1="OrangeHRM - New Level of HR Management";
	static String title2="OrangeHRM";
     
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		//Actual result :comparison: Expected result
		if(driver.getTitle().equals(title1)) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(By.name("Submit")).click();
        Thread.sleep(3000);
        if(driver.getTitle().equals(title2)) {
        	System.out.println("Title matched");    
        	}
        	else {
        	System.out.println("Title not matched");
        	System.out.println(driver.getTitle());
        	}
        //---MouseMove
        Actions ac = new Actions(driver);
        ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Add Employee")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(3000);
        System.out.println("logout completed");
        driver.close();
	}

}
