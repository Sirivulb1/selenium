package Project1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> id = ids.iterator();
		String Parentid= id.next();
		System.out.println(driver.getTitle());
		String Childid = id.next();
	
		driver.switchTo().window(Childid);
		
		System.out.println(driver.getTitle());
		
		
		

	}

}
