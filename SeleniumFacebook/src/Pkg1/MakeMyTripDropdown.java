package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTripDropdown
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("Webdriver.chrome.silentOutput","True");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Munender\\Desktop\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	
	WebElement dropdown=driver.findElement(By.id("fromCity"));
	Thread.sleep(2000);
	
	Actions ac=new Actions(driver);
	
	dropdown.click();
	ac.sendKeys(dropdown,Keys.ARROW_DOWN);
	ac.sendKeys(dropdown,Keys.ARROW_DOWN);
	ac.sendKeys(dropdown,Keys.ARROW_DOWN);
	ac.sendKeys(dropdown,Keys.ARROW_DOWN).perform();
}
}
				