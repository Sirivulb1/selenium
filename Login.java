package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		  WebDriver driver1=new ChromeDriver();
		  driver1.get("http://facebook.com");
		  driver1.findElement(By.id("email")).sendKeys("bobby.sirivuluri@gmail.com");
		  driver1.findElement(By.name("pass")).sendKeys("9951629963");
		  //driver1.findElement(By.linkText("Forgot account?")).click();
		  driver1.findElement(By.partialLinkText("Forgot acc")).click();
		
		  
		  
		  
		  driver1.findElement(By.xpath(".//*[@id='u_0_n']")).click();

	}

}
