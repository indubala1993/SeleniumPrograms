package Pkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signupusingmultiplegeneric 
{
	public void Dropdownselection(WebElement element,String text)
	{
	Select s1=new Select(element);
	s1.selectByVisibleText(text);
	}
	
	public void Dropdownselection(WebElement element,int value)
	{
	Select s2=new Select(element);
	s2.selectByIndex(value);
	}
	
	public static void main(String[] args)
	{
		Signupusingmultiplegeneric obj=new Signupusingmultiplegeneric();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Munender\\Desktop\\chromedriver.exe");
	    
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
	   WebElement day=driver.findElement(By.cssSelector("select#day"));
	   obj.Dropdownselection(day, 8); 
	    
	    WebElement month=driver.findElement(By.cssSelector("select#month"));
	    obj.Dropdownselection(month, "Jul");
	    
	   WebElement year=driver.findElement(By.cssSelector("select#year"));
	   obj.Dropdownselection(year, "1993"); 
	    
		
	}
}
