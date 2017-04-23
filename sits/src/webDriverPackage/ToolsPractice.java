package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		driver.findElement(By.name("firstname")).sendKeys("Boku");
		

	}

}
