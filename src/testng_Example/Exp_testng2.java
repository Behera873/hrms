package testng_Example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_testng2 {
    @BeforeClass
    public void login() {
    	System.out.println("Login Complete");
    }
    @AfterClass
    public void logout() {
    	System.out.println("Logout Complete");
    }
    @Test(priority=2)
    public void addemp(){
    	System.out.println("Add Emp");
    }
    @Test(priority=1)
    public void delemp() {
    	System.out.println("Delete emp");
    }
}
