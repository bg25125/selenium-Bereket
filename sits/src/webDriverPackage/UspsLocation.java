package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UspsLocation {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.usps.com");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	 driver.findElement(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[2]/a/span")).click();
	 Thread.sleep(5000);
	
     driver.findElement(By.xpath(".//*[@id='shortcuts-menu']/div[1]/div[3]/div[3]/a")).click();
     Thread.sleep(5000);
     driver.findElement(By.xpath(".//*[@id='tCityStateZip']")).sendKeys("20853");
     driver.findElement(By.xpath(".//*[@id='bSearch']")).submit();
     
     
     
     
     
     
	

	}

}
