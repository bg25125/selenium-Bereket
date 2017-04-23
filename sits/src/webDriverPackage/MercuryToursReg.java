package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryToursReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Open Firefox web browser
		WebDriver driver= new FirefoxDriver();
		//Launch Mercury Website
		driver.get("http://newtours.demoaut.com/");
		//Print the title of the page
		driver.getTitle();
		//Print
		System.out.println(driver.getTitle());
		//Click on Register link
		driver.findElement(By.linkText("REGISTER")).click();
		//Enter First name
		driver.findElement(By.name("firstName")).sendKeys("Bereket");
		driver.findElement(By.name("lastName")).sendKeys("Gizaw");
		driver.findElement(By.id("userName")).sendKeys("boku.com");
		driver.findElement(By.name("phone")).sendKeys("23048576");
		driver.findElement(By.name("address1")).sendKeys("1400 Rockville pike");
		driver.findElement(By.name("address2")).sendKeys("201");
		driver.findElement(By.name("city")).sendKeys("Rockville");
		driver.findElement(By.name("state")).sendKeys("Maryland");
		driver.findElement(By.name("postalCode")).sendKeys("20852");
		driver.findElement(By.name("country")).sendKeys("UNITED STATES");
		driver.findElement(By.id("email")).sendKeys("23htgr@gmail.com");
		driver.findElement(By.name("password")).sendKeys("201201");
		driver.findElement(By.name("confirmPassword")).sendKeys("201201");
		driver.findElement(By.name("register")).click();
		

	}

}
