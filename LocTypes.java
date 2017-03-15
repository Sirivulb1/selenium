package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");	
		
		driver.findElement(By.id("search_query_top")).sendKeys("dress");//Id
		
		driver.findElement(By.name("search_query")).sendKeys("dress");//Name
		
			 driver.findElement(By.cssSelector(".search_query.form-control.ac_input")).sendKeys("dress");// css
		 
		driver.findElement(By.className("sf-with-ul")).click();// class 
		//by tag name  finding number of div inside class "columns-container"
		WebElement divisions = driver.findElement(By.className("columns-container"));
		List<WebElement> divlist = divisions.findElements(By.tagName("div"));
		 System.out.println("number of divisions inside class: columns-container are "+divlist.size());
		
		 driver.findElement(By.linkText("Our stores")).click(); //link text
		 
		
		 driver.findElement(By.partialLinkText("slip")).click(); //partial link text
		 
		 driver.findElement(By.xpath(".//*[@id='email_create']")).sendKeys("lavanya@xyz.com");//by xpath

	}

}
