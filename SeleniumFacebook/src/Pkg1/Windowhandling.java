package Pkg1;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Windowhandling
{
	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.chrome.silentOutput","True"); // removes unnecessary timeouts
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Munender\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
		WebElement video=driver.findElement(By.id("img"));
		Actions ac=new Actions(driver); //ctrl+click
		ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
		System.out.println("******Before Switching url*********");
		System.out.println(driver.getCurrentUrl());
		
		String currentWindowAddress=driver.getWindowHandle(); // First TAB Address
		
		Set<String> allWindowsAddress=driver.getWindowHandles();  //All TAB address
		
		int i=0;
		for(String s:allWindowsAddress)  //for each loop
		{
			i=i+1;
			if(i==2)
			{
				driver.switchTo().window(s);	
			}
			
		}
		System.out.println("******AFTER Switching url*********");
		System.out.println(driver.getCurrentUrl());
		
		//now if you wants to go back to first tab back
		driver.switchTo().window(currentWindowAddress);
		
		System.out.println("**********After switiching again*********");
		System.out.println(driver.getCurrentUrl());
	}
}
