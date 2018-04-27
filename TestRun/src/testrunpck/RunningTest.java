package testrunpck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RunningTest {

	/**
	 * @param args
	 */
	
		static WebDriver driver;

		/**
		 * This function will execute before each Test tag in testng.xml
		 * @param browser
		 * @throws Exception
		 */
		@BeforeTest
		@Parameters("browser")
		public void setup(String browser) throws Exception{
			//Check if parameter passed from TestNG is 'firefox'
			if(browser.equalsIgnoreCase("Firefox")){
			//create firefox instance
				System.setProperty("webdriver.firefox.marionette", "D:\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			//Check if parameter passed as 'chrome'
			else if(browser.equalsIgnoreCase("Chrome")){
				//set path to chromedriver.exe
				System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
				//create chrome instance
				driver = new ChromeDriver();
			}
			//Check if parameter passed as 'Edge'
					
					
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@Test
		public void testParameterWithXML() throws InterruptedException{
			driver.get("http://demo.guru99.com/V4/");
			//Find user name
			WebElement userName = driver.findElement(By.name("uid"));
			//Fill user name
			userName.sendKeys("guru99");
			//Find password
			WebElement password = driver.findElement(By.name("password"));
			//Fill password
			password.sendKeys("guru99");
		
	}

}
