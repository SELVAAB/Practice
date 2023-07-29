package com.pack;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
        ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		WebElement male=driver.findElement(By.id("male"));
		male.click();
		male.getText();
		Assert.assertTrue(male.isDisplayed());
		System.out.println("male locator is displayed");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]")).click();
        Thread.sleep(3000);
       driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//div[@class='custom-file']")).click();
	}

}
