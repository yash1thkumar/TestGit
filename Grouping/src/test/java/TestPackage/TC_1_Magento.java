package TestPackage;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import MagentaPages.SignUp;

public class TC_1_Magento
{
	
	static SignUp s=new SignUp();
	
	@Test(priority = 1, groups = {"e2e","check"})
	@Parameters("browser")
	public synchronized void launchbrswr(String browser) throws IOException
	{
		s.launchbrowser(browser);
		System.out.println("Browser launched : "+browser);
	}

	@Test(priority = 2, groups = {"check"})
	public synchronized void checkele()
	{
		System.out.println( "Cancel displayed : "+SignUp.driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div/div/p/a")).isDisplayed());
		System.out.println("First name displayed: "+SignUp.driver.findElement(By.xpath("//*[@id=\"firstname\"]")).isDisplayed());
		System.out.println("Company name displayed: "+SignUp.driver.findElement(By.id("self_defined_company")).isDisplayed());
	}
	
	@Test(priority = 3, groups = {"e2e"})
	public synchronized void senddata()
	{
		SignUp.driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("ABCD");
		System.out.println("ABCD sent to first name");
		SignUp.driver.findElement(By.id("self_defined_company")).sendKeys("XYZ");
		System.out.println("XYZ is sent to company name");
	}
	
	@Test(priority = 4,groups = {"e2e","check"})
	public synchronized void checkbox()
	{
		SignUp.driver.findElement(By.xpath("//*[@id=\"agree_terms\"]")).click();
		System.out.println("checkbox is selected");
		System.out.println("");
	}
	
}
