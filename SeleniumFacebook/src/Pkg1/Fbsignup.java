package Pkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Fbsignup
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Munender\\Desktop\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement user=driver.findElement(By.id("email"));
        user.sendKeys("789654123");
       WebElement password=driver.findElement(By.cssSelector("input#pass"));
        password.sendKeys("789456123");
         WebElement loginButton=driver.findElement(By.id("loginbutton"));
        loginButton.click();
	}
}
