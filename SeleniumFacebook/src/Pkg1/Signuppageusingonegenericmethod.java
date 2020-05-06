package Pkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signuppageusingonegenericmethod
{
//Generic method created,so that we don't need to create obj of select class again and again
	public void Dropdownselection(WebElement element,String text)
	{
		Select s=new Select(element);
	    s.selectByVisibleText(text);
	}
	public static void main(String[] args) 
	{
		Signuppageusingonegenericmethod obj=new Signuppageusingonegenericmethod();//Method made here once so we can call it multiple times
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Munender\\Desktop\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
	   WebElement day=driver.findElement(By.cssSelector("select#day"));
	   obj.Dropdownselection(day, "8"); 
	    
	    WebElement month=driver.findElement(By.cssSelector("select#month"));
	    obj.Dropdownselection(month, "Jul");
	    
	   WebElement year=driver.findElement(By.cssSelector("select#year"));
	   obj.Dropdownselection(year, "1993"); 
	    
	}
}
