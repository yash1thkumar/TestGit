package MagentaPages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignUp 
{
	public static WebDriver driver;
	public static WebElement elem;
	
	public synchronized void launchbrowser(String browsername) throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\Yash\\Documents\\Eclipse workspace\\New workspace\\Grouping\\Site.properties");
		Properties p=new Properties();
		p.load(f);
		
		if(browsername.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//WebDriversex//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();		}
		
		if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//WebDriversex//geckodriver.exe");
		    driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));

	}
}
