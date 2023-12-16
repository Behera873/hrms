package project_HRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_Login_Logout {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://183.82.103.245/nareshit/login.php");
        Thread.sleep(3000);
        System.out.println("Lunch the Application");
        driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
        System.out.println("Enter username");
        driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
        Thread.sleep(3000);
        System.out.println("Enter password");
        driver.findElement(By.name("Submit")).click();
        Thread.sleep(3000);
        System.out.println("Log in Application");
        driver.findElement(By.linkText("Logout"));
        Thread.sleep(3000);
        System.out.println("Logout Application");
        driver.close();
	}
}
