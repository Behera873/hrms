package testng_Example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//It has been execute ascending order by alphabetical way
public class Exp_testng {
@BeforeClass
public void login() {
	System.out.println("Login Completed");
}
@AfterClass
public void Logout() {
	System.out.println("Logout Completed");
}
@Test
public void AddEmp() {
	System.out.println("Add new Emp");
}
@Test
public void DeleEmp() {
	System.out.println("Delete Emp");
}
}
