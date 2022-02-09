package ddtdemo;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class dex 

{
	public static WebDriver driver;
	
 
  @Test
  @Parameters("search")
  public void f(String search) 
  {
	  driver.get("https://www.fnp.com");
	  driver.findElement(By.xpath("//input[@id='header-search-input']")).sendKeys(search);
  }
  
  @BeforeClass
  public void beforeClass()
  {
	    System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
  }

  @AfterClass
  public void afterClass()
  {
	  driver.quit();
  }

}
