package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HerndonVAWeather {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement element= driver.findElement(By.name("q"));
		element.sendKeys("Herndon VA Weather");
		Thread.sleep(5000);
		driver.findElement(By.name("btnG")).click();
		
		System.out.println("Page title is : " + driver.getTitle());
		
		

	}

}
