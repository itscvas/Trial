package org.windows;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows {
public static void main(String[]args) throws Throwable{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\SIVA\\eclipse-workspace\\Windows\\Drivers\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();

	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement close = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	WebElement click = driver.findElement(By.xpath("//button[@type='submit']"));
	Thread.sleep(2000);
	
	Actions acc = new Actions(driver);
	
	acc.moveToElement(close).perform();
	
	
}
}
