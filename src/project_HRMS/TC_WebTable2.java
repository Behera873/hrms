package project_HRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_WebTable2 {

	public static void main(String[] args)throws Exception {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("C:\\Users\\91737\\Downloads\\WebTable.html");
		//count
		int row=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
		int col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
		int row_col=driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();

		System.out.println("Row Count " + row);
		System.out.println("col Count " + col);
		System.out.println("Row_col Count " + row_col);
		//Data -- cell
		String celldata=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
		System.out.println(celldata);
		//Data -- Table
		//  DT var VV
		for(int i=1; i<=row; i++) {
		String data = driver.findElement(By.
		    xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
		System.out.println(data);
		Thread.sleep(3000);
		}

		driver.close();



	}

}
