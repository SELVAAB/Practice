package com.pack;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
        ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		WebElement down=driver.findElement(By.xpath("//select[@class='custom-select']"));
		
		down.click();
		Thread.sleep(3000);
		
		Select sec=new Select(down);
		sec.selectByVisibleText("Norway");
		String countryname=sec.getFirstSelectedOption().getText();
		Assert.assertEquals(countryname, countryname);
		System.out.println("country name "+"using selected by visible tex pass");
		
		Thread.sleep(3000);
		sec.selectByVisibleText("Spain");
		
		Thread.sleep(3000);
		sec.selectByVisibleText("Greece");
		Thread.sleep(3000);
		
		sec.selectByVisibleText("Turkey");
		Thread.sleep(3000);
		sec.selectByVisibleText("Sweden");
		Thread.sleep(3000);
		sec.selectByValue("1");
		Thread.sleep(3000);
		sec.selectByValue("1");
		Thread.sleep(3000);
		sec.selectByValue("2");
		Thread.sleep(3000);
		sec.selectByValue("3");
		Thread.sleep(3000);
		sec.selectByValue("4");
		Thread.sleep(3000);
		sec.selectByValue("5");
		Thread.sleep(3000);
		sec.selectByValue("6");
		Thread.sleep(3000);
		sec.selectByValue("7");
		Thread.sleep(3000);
		sec.selectByValue("8");
		Thread.sleep(3000);
		sec.selectByValue("9");
		
		
	}

}
