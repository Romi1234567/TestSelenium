package com.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void priceCheck() throws InterruptedException {
  driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
  WebElement monthPack1= driver.findElement(By.xpath("//span[contains(text(),'1 Week Package')]"));
  String priceMonthPack1=monthPack1.getText();
  System.out.println(priceMonthPack1);
  WebElement priceChecker=driver.findElement(By.xpath("//div[contains(text(),'Price Checker')]"));
  Actions a=new Actions(driver);
  a.dragAndDrop(monthPack1, priceChecker);
  Thread.sleep(5000);
  String packPrice=driver.findElement(By.xpath("//span[contains(@id,'_ContentPlaceholder1_Label1')]")).getText();
  System.out.println("Price Checker checks for the package: "+ packPrice);
  if(packPrice.contains(priceMonthPack1)){
	  String[] p= packPrice.split("$");
	  String p1= p[1];
	  System.out.println("The 1 week package for Maldives: "+p[1]);
  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aparna.a.mohanty\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
  }

}
