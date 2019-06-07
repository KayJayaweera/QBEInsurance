package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLogin {
	
	public WebDriver driver;
	//public String browser;

	public WebDriver initialization() throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\777653\\eclipse-workspace\\QBE\\src\\main\\java\\resources\\data.properties");
		prop.load(fs);
		
		String browsername = prop.getProperty("browser");
		
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\777653\\Desktop\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(prop.getProperty("url"));
			return driver;
		}
	
		else if (browsername.equals("firefox"));
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\777653\\Desktop\\geckodriver.exe");
	
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get(prop.getProperty("url"));
			
			return driver;
		}
	
	}
}
