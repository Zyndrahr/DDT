package ddf;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class dataframework 

{
	public static WebDriver driver;
	
  @Test(dataProvider = "dp")
  public void f(String search)
  {
	  driver.get("https://www.fnp.com");
	  driver.findElement(By.xpath("//input[@id='header-search-input']")).sendKeys(search);
  }

  @DataProvider
  public Object[][] dp() throws IOException
  {
   
   DDF1 dd = new DDF1("C:\\Users\\HAWKEYE\\Downloads\\datadriventest.xlsx");
   int totalrow = dd.rowcount(0);
   Object[][]data = new Object[totalrow][2];
   
   for(int i=0;i<totalrow;i++) 
   {
	   data[i][0]=dd.getdata(0, i, 0);
	   data[i][1]=dd.getdata(0, i, 1);
   }
   return data;
    
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
