package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AjexCalls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions abc = new Actions(driver);
		
		WebElement des = driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[2]/div/a[1]/span[2]"));
		abc.moveToElement(des).build().perform();
		
		Thread.sleep(5000);
		
		
		
		
		
		
	}

}
