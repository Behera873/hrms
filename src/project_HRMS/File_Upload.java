package project_HRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("Behera");
		driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("Subhransu");
		//To Upload a File
		WebElement fileinput = driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
		fileinput.sendKeys("D:\\Papi\\my pic\\IMG_20221231_093536.jpg");
		Thread.sleep(3000);
		System.out.println("File upload successfully");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(3000);
		System.out.println("New Empolyee Add");
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Logout"));
        driver.close();
	}

}
