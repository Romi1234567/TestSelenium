package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest1 {
WebDriver driver;
  @Test
  public void RegisterDemoaut() {
	  driver.get("http://www.newtours.demoaut.com/");
	  driver.findElement(By.linkText("REGISTER")).click();
	  driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Appy1");
	  driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("fizz1");
	  driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234456789");
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("apo@rt.com");
	  driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("salami street");
	  driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("pisita");
	  driver.findElement(By.xpath("//input[@name='city']")).sendKeys("US xx1");
	  driver.findElement(By.xpath("//input[@name='state']")).sendKeys("muskorta");
	  driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("456873");
	  Select Choosecountry=new Select(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select")));
	  Choosecountry.selectByVisibleText("UNITED STATES ");
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sappy4334");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sappy4334");
	  driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("sappy4334");
	  driver.findElement(By.xpath("//input[@name='register']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aparna.a.mohanty\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
  }

  
}
