package Assertions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Hard_Assert 
{
	public WebDriver driver;
  
  
  @Test(priority=1,description="login with valid details")
  public void LoginWithValidDetails() 
  {
	  String act_title=driver.getTitle();
	  String exp_title="Welcome: Mercury Tours";
	  Assert.assertEquals(act_title, exp_title);
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Suvidyap1");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P@ssword1");
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	  driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	  boolean act_flag=driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
	  boolean exp_flag=true;
	  Assert.assertEquals(act_flag, exp_flag);
	  System.out.println("flight finder displayed");
	  System.out.println("successfully");
  }
  
  
  @Test(priority=2,description="login with invalid details")
  public void LoginWithInValidDetails()
  {
	  String act_title1=driver.getTitle();
	  String exp_title1="Welcome";
	  Assert.assertEquals(act_title1, exp_title1,"wrong message");
	  System.out.println("verified title");
  }
  
  
 
  
  @BeforeMethod
  public void getCookie() 
  {
	  Set<Cookie> cookie=driver.manage().getCookies();
	  for(Cookie c:cookie)
	  {
	     System.out.println("the name of the cookie is the:-"+c);
	  }
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void Maximize_Window() 
  {
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void deleteAllCookies() 
  {
	  System.out.println("delete all the cookies");
  }

  @BeforeTest
  public void enterApplicationURL() 
  {
	  System.out.println("please enter the url");
	  driver.get("http://newtours.demoaut.com/");
	  System.out.println("EnterApplicationURL() method is in BeforeTest method");
  }

  @AfterTest
  public void dbConnectionClose() 
  {
	  System.out.println("close the db connection");
  }

  @BeforeSuite
  public void openBrowser() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Java\\Selenium1\\chromedriver_win32(1)\\chromedriver.exe");
	 driver= new ChromeDriver();
	  System.out.println("openBrowser method under BeforeSuite method");
  }

  @AfterSuite
  public void close() 
  {
	  System.out.println("close the connection");
  }

}
