package MagentaPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keys12 
{

public	static 	WebDriver driver;
public static WebElement elem;
	public void Site(String site)
	{
		driver.get(site);
	}

	public void launch(String browsername) 
	{
		if(browsername.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//WebDriversex//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//WebDriversex//geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}
	
	public WebElement findel(String Locatortype,String Locatorvalue)
	{
		if(Locatortype.equals("id"))
		{elem=driver.findElement(By.id(Locatorvalue));}
		if(Locatortype.equals("class"))
		{elem=driver.findElement(By.className(Locatorvalue));}
		if(Locatortype.equals("name"))
		{elem=driver.findElement(By.name(Locatorvalue));}
		if(Locatortype.equals("tag"))
		{elem=driver.findElement(By.tagName(Locatorvalue));}
		if(Locatortype.equals("linktext"))
		{elem=driver.findElement(By.linkText(Locatorvalue));}
		if(Locatortype.equals("xpath"))
		{elem=driver.findElement(By.xpath(Locatorvalue));}
		if(Locatortype.equals("css"))
		{elem=driver.findElement(By.cssSelector(Locatorvalue));}
		if(Locatortype.equals("partiallinktext"))
		{elem=driver.findElement(By.partialLinkText(Locatorvalue));}
		return elem;
	}
	
	public void maxwindow()
	{
		driver.manage().window().maximize();
	}
	
	
	public void implicitly(int i,String s)
	{
		if(s.equalsIgnoreCase("seconds"))
		{	
			TimeUnit t=TimeUnit.SECONDS;
			driver.manage().timeouts().implicitlyWait(i, t);
		}
		if(s.equalsIgnoreCase("mili"))
		{	
			TimeUnit t=TimeUnit.MILLISECONDS;
			driver.manage().timeouts().implicitlyWait(i, t);
		}
		if(s.equalsIgnoreCase("micro"))
		{	
			TimeUnit t=TimeUnit.MICROSECONDS;
			driver.manage().timeouts().implicitlyWait(i, t);
		}if(s.equalsIgnoreCase("nano"))
		{	
			TimeUnit t=TimeUnit.NANOSECONDS;
			driver.manage().timeouts().implicitlyWait(i, t);
		}
		
	}

	public void enterdata(String Locatortype,String Locatorvalue,String data)
	{
		if(Locatortype.equals("id"))
		{driver.findElement(By.id(Locatorvalue)).sendKeys(data);}
		if(Locatortype.equals("class"))
		{driver.findElement(By.className(Locatorvalue)).sendKeys(data);}
		if(Locatortype.equals("name"))
		{driver.findElement(By.name(Locatorvalue)).sendKeys(data);}
		if(Locatortype.equals("tag"))
		{driver.findElement(By.tagName(Locatorvalue)).sendKeys(data);}
		if(Locatortype.equals("linktext"))
		{driver.findElement(By.linkText(Locatorvalue)).sendKeys(data);}
		if(Locatortype.equals("xpath"))
		{driver.findElement(By.xpath(Locatorvalue)).sendKeys(data);}
		if(Locatortype.equals("css"))
		{driver.findElement(By.cssSelector(Locatorvalue)).sendKeys(data);}
		if(Locatortype.equals("partiallinktext"))
		{driver.findElement(By.partialLinkText(Locatorvalue)).sendKeys(data);}
	}
	
	public void click(String Locatortype,String Locatorvalue)
	{
		if(Locatortype.equals("id"))
		{driver.findElement(By.id(Locatorvalue)).click();}
		if(Locatortype.equals("class"))
		{driver.findElement(By.className(Locatorvalue)).click();}
		if(Locatortype.equals("name"))
		{driver.findElement(By.name(Locatorvalue)).click();}
		if(Locatortype.equals("tag"))
		{driver.findElement(By.tagName(Locatorvalue)).click();}
		if(Locatortype.equals("linktext"))
		{driver.findElement(By.linkText(Locatorvalue)).click();}
		if(Locatortype.equals("xpath"))
		{driver.findElement(By.xpath(Locatorvalue)).click();}
		if(Locatortype.equals("css"))
		{driver.findElement(By.cssSelector(Locatorvalue)).click();}
		if(Locatortype.equals("partiallinktext"))
		{driver.findElement(By.partialLinkText(Locatorvalue)).click();}
	}
	

	
}
