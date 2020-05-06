package Pkg1;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupusingXpath 
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
	WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
	firstname.sendKeys("Indu");
	WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname' or @id='u_0_s']"));
	lastname.sendKeys("Bala");
	WebElement email=driver.findElement(By.xpath("//*[@name='reg_email__']"));
    email.sendKeys("123@gmail.com");
    WebElement confirmemail=driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']"));
    confirmemail.sendKeys("123@gmail.com");
    WebElement Password=driver.findElement(By.xpath("//*[@*='reg_passwd__']"));
    Password.sendKeys("abc");
    WebElement gender=driver.findElement(By.xpath("//*[@*='u_0_6']"));
    gender.click();
    WebElement day=driver.findElement(By.xpath("//*[@*='day']"));
    Select s=new Select(day);
    s.selectByIndex(8);
    WebElement month=driver.findElement(By.xpath("//*[@*='month']"));
    Select s1=new Select(month);
    s1.selectByVisibleText("Jul");
    WebElement year=driver.findElement(By.xpath("//*[@*='year']"));
    Select s2=new Select(year);
    s2.selectByValue("1993");
    
}
@After
public void After()
{
	WebElement signup=driver.findElement(By.xpath("//*[@*='u_0_13']"));
	signup.click();
}
}
