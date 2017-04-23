package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PhpTravels {

	public static void main(String[] args) throws InterruptedException {
		
		int x=1;
		while (x<20){
			
		
				
	WebDriver driver = new FirefoxDriver();
	driver.get("http://phptravels.net/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();
	driver.findElement(By.xpath(".//*[@id='headersignupform']/div[3]/input"));
	driver.findElement(By.name("firstname")).sendKeys("Bereket");
    driver.findElement(By.name("lastname")).sendKeys("Gizaw");
    driver.findElement(By.name("phone")).sendKeys("2404738432");
   // int x=10;
   // if (x==10){
    	driver.findElement(By.name("email")).sendKeys("dytre@gmail.com");
    }
   // else{
    	//driver.findElement(By.name("email")).sendKeys("reddi2000+x+@gmail.com");
    }
    //driver.findElement(By.name("email")).sendKeys("rgtfe@gmail.com");
    driver.findElement(By.name("password")).sendKeys("mercury");
    driver.findElement(By.name("confirmpassword")).sendKeys("mercury");
    driver.findElement(By.xpath(".//*[@id='headersignupform']/div[9]/button")).click();
    //driver.findElement
    //Thread.sleep(5000);
	//Register 10 account with tester2000@gmail.com to tester2010@gmail.com
	// int x=1
    //driver.close();
    x=x+1;
    //or x++;

	}

}
