package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Soft_Assert 
{
	SoftAssert softassert= new SoftAssert();
  @Test(priority=1)
  public void soft1() 
  {
	  System.out.println("1");
	  softassert.assertEquals(true, true);
	  System.out.println("2");
	  softassert.assertEquals(10, 20);
	  System.out.println("3");
	  softassert.assertEquals(true, false);
	  System.out.println("4");
	  softassert.assertEquals(34.6, 34.6);
	  System.out.println("5");
	  softassert.assertEquals('v', 'a');
	  System.out.println("6");
	  softassert.assertEquals(1000, 1000);
	  System.out.println("7");
	  softassert.assertEquals("vanita", "anchal");
	  System.out.println("8");
	  softassert.assertAll();
  }
  
  @Test(priority=2)
  public void soft2()
  {
	  SoftAssert softassert1= new SoftAssert();
	  System.out.println("7");
	  softassert1.assertEquals(false, false);
	  System.out.println("8");
	  softassert1.assertEquals(10.65, 20.76);
	  System.out.println("9");
	  softassert1.assertEquals(false, true);
	  System.out.println("10");
	  softassert1.assertEquals(600.0, 600.0);
	  System.out.println("11");
	  softassert1.assertEquals('a', 'a');
	  softassert1.assertAll();
  }
  
  @Test(priority=3)
  public void soft3()
  {
	  SoftAssert softassert2= new SoftAssert();
	  System.out.println("12");
	  softassert2.assertEquals(true, true,"pass");
	  System.out.println("13");
	  softassert2.assertEquals(30, 20,"wrong value");
	  System.out.println("14");
	  softassert2.assertEquals(true, false);
	  System.out.println("15");
	  softassert2.assertEquals(34, 34);
	  System.out.println("16");
	  softassert2.assertEquals('s', "vanita","wrong");
	  softassert2.assertAll();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
