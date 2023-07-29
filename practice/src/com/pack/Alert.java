package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
        ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
	//simple alert
		WebElement sim=driver.findElement(By.id("accept"));
		sim.click();
		
		
		org.openqa.selenium.Alert alt=driver.switchTo().alert();
		String namee=alt.getText();
		System.out.println(namee);
		alt.getText();
		alt.accept();
	//confirm alert
		
		WebElement confirm=driver.findElement(By.id("confirm"));
		confirm.click();
		org.openqa.selenium.Alert alt1=driver.switchTo().alert();
		String an=alt1.getText();
		System.out.println(an);
		alt1.accept();
		
    //prompt alert
		
		WebElement prom=driver.findElement(By.id("prompt"));
		prom.click();
	
		org.openqa.selenium.Alert alert=driver.switchTo().alert();
		alert.sendKeys("1234567");
		System.out.println(alert.getText());
		alert.accept();
		String name=driver.findElement(By.id("myName")).getText();
		System.out.println(name);
		Thread.sleep(3000);
		
		//actions class
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.className("navbar-link"))).build().perform();
		WebElement a=driver.findElement(By.className("navbar-link"));
		act.moveToElement(a).build().perform();
		String bc=a.getCssValue("backgroundcolour");
		System.out.println(bc);
		WebElement play=driver.findElement(By.className("navbar-item"));
		String nam=play.getText();
		System.out.println(nam);
		act.contextClick(play).build().perform();
		
		
	}

}
