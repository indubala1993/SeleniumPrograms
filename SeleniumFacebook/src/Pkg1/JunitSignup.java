package Pkg1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JunitSignup 
{
	ChromeDriver driver;
	@Before
	public void Before()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Munender\\Desktop\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	}
	@Test
	public void Test()
	{
		WebElement firstname=driver.findElement(By.name("firstname"));
	    firstname.sendKeys("Indu");
	    WebElement lastname=driver.findElement(By.name("lastname"));
	    lastname.sendKeys("bala");
	    WebElement email=driver.findElement(By.name("reg_email__"));
	    email.sendKeys("123@gmail.com");
	    WebElement confirmemail=driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
	    confirmemail.sendKeys("123@gmail.com");
	    WebElement Password=driver.findElement(By.name("reg_passwd__"));
	    Password.sendKeys("abc");
	    WebElement gender=driver.findElement(By.cssSelector("input[id='u_0_6']"));
	    gender.click();
	    WebElement day=driver.findElement(By.cssSelector("select#day"));
	    Select s=new Select(day);
	    s.selectByIndex(8);
	    WebElement month=driver.findElement(By.cssSelector("select#month"));
	    Select s1=new Select(month);
	    s1.selectByVisibleText("Jul");
	    WebElement year=driver.findElement(By.cssSelector("select#year"));
	    Select s2=new Select(year);
	    s2.selectByValue("1993");
	}
	@After
	public void After()
	{
		WebElement signupButton=driver.findElement(By.id("u_0_13"));
	    signupButton.click();
	}	
}
