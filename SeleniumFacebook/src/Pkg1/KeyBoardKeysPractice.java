package Pkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardKeysPractice
{
public static void main(String[] args)
{
	System.setProperty("Webdriver.chrome.silentOutput","true");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Munender\\Desktop\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/key_presses");//Site to practice keyboard keys
	driver.manage().window().maximize();
	
	WebElement keyss = driver.findElement(By.xpath("//input[@id='target']"));
	Actions ac=new Actions(driver);
	//ac.sendKeys(Keys.ESCAPE).perform();
	//ac.sendKeys(Keys.TAB).perform();
	ac.keyDown(keyss,Keys.ALT).click(keyss).keyUp(keyss,Keys.ALT).build().perform();
	}
}