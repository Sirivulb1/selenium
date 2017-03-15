package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "/Users/bobbysirivuluri/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
     	Actions abc = new Actions(driver);
        abc.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]"))).build().perform();
        
        WebElement xyz= driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
        abc.contextClick(xyz).build().perform();
        abc.keyDown(Keys.SHIFT).moveToElement(xyz).sendKeys("smallletters").build().perform();    
        


	}

}
