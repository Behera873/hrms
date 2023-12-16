package project_HRMS;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_WH {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//1st wind
		driver.get("file:///D:/HTML%20codes/Naresh_IT_project1.html");
		Thread.sleep(3000);
		System.out.println("Successfully Opened First Window");
        //2nd wind
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(3000);
		System.out.println("Successfully Opened Second Window");
		//3rd wind
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(3000);
		System.out.println("Successfully Opened Third Window");
		ArrayList<String>windinfo = new ArrayList<String>(driver.getWindowHandles());
		//switch To first wind1
		driver.switchTo().window(windinfo.get(0));
		Thread.sleep(3000);
		//driver.close();
		driver.quit();
	}

}
