package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public interface Facebook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	
		ChromeDriver driver = new ChromeDriver();		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aishw");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
	
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("919789661351");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("*A1bc");
	
		WebElement findElement = driver.findElement(By.xpath("//select[@id='day']"));
		Select s= new Select(findElement);
		s.selectByValue("3");
		WebElement find = driver.findElement(By.xpath("//select[@id='month']"));
		Select s2 = new Select(find);
		s2.selectByIndex(0);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s3= new Select(year);
		s3.selectByVisibleText("2007");	
	driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	}	         
}
