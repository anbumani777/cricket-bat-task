package sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricketBat {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		  WebElement close = driver.findElement(By.xpath("//button[text()='✕']"));
		  close.click();
		 
		  WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		  search.sendKeys("CricketBat");
		  
		 
		  WebElement sear = driver.findElement(By.xpath("//button[@type='submit']"));
		  sear.click();
		 
          WebElement batclick = driver.findElement(By.xpath("//a[@title='LYCAN Beast Full Size Cricket Bat Age 15+ PVC/Plastic Cricket  Bat']"));
		  batclick.click();
		  
		  String parent = driver.getWindowHandle();
		  Set<String> child = driver.getWindowHandles();
		  for (String children : child) {
			  
			  if(!parent.equals(child)) {
				  driver.switchTo().window(children);
			
		}
			  }
			  
			
		
		  
		  TakesScreenshot tk =(TakesScreenshot)driver;
		  File source = tk.getScreenshotAs(OutputType.FILE);
		  File dest =new File(".//screenshort//report.png");
		  FileUtils.copyFile(source,dest);
		  
		  
		  
		  
		  
		  
		  
		  
		  
	     
}	  
		  
}		  



